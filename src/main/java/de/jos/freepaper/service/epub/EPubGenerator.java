/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.jos.freepaper.service.epub;

import com.adobe.epubcheck.api.EpubCheck;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.zip.Deflater;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 *
 * @author wuesand
 */
public class EPubGenerator {

    private List<EPubFileDto> EPUB_FILES_UNIQUE = Arrays.asList( //
            new EPubFileDto("", "mimetype", false), // TODO add cmopression flag as well so we do not have to compare the name
            new EPubFileDto("META-INF/", "container.xml", false), //
            new EPubFileDto("", "toc.ncx", true), //
            new EPubFileDto("", "cover.html", true), //
            new EPubFileDto("", "toc.html", true), //
            new EPubFileDto("", "content.opf", true) //
    );

    public EPubGenerator() {

    }

    public void generate(List<StoryDto> stories, OutputStream out) {
        final UUID uuid = UUID.randomUUID();

        final ByteArrayOutputStream bout = new ByteArrayOutputStream();

        try (final ZipOutputStream zout = new ZipOutputStream(bout)) {

            Configuration cfg = new Configuration();

            // Where do we load the templates from:
            cfg.setClassForTemplateLoading(EPubGenerator.class, "");

            // some other config
            cfg.setDefaultEncoding(StandardCharsets.UTF_8.name());
            cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
            cfg.setLocale(Locale.GERMANY);

            final Map<String, Object> input = new HashMap<>();
            input.put("stories", stories);
            input.put("uuid", uuid);
            input.put("creationTime", new Date());

            for (EPubFileDto epubFile : EPUB_FILES_UNIQUE) {
                final String fileNameInZip = epubFile.getDirectory() + epubFile.getName();

                final String contentToWrite;
                if (epubFile.isIsTemplate()) {
                    final Template template = cfg.getTemplate(epubFile.getName());
                    final Writer stringWriter = new StringWriter();
                    template.process(input, stringWriter);
                    contentToWrite = stringWriter.toString();
                } else {
                    final InputStream inputStream = EPubGenerator.class.getResourceAsStream(epubFile.getName());
                    contentToWrite = new BufferedReader(new InputStreamReader(inputStream))
                            .lines().collect(Collectors.joining("\n"));
                }

                System.out.println("result : " + contentToWrite);

                ZipEntry ze = new ZipEntry(fileNameInZip);

                if ("mimetype".equals(epubFile.getName())) {
                    zout.setLevel(Deflater.NO_COMPRESSION);
                    zout.setMethod(ZipOutputStream.DEFLATED);
                } else {
                    zout.setLevel(Deflater.BEST_COMPRESSION);
                    zout.setMethod(ZipOutputStream.DEFLATED);
                }
                zout.putNextEntry(ze);

                byte[] data = contentToWrite.getBytes();
                zout.write(data, 0, data.length);

                // send data to zout;
                zout.closeEntry();
            }

            int counter = 0;
            for (StoryDto story : stories) {
                String fileNameInZip = "story" + counter + ".html";

                final Map<String, StoryDto> templateInput = Collections.singletonMap("story", story);

                final Template template = cfg.getTemplate("story.ftl");
                final Writer stringWriter = new StringWriter();
                template.process(templateInput, stringWriter);
                final String contentToWrite = stringWriter.toString();

                ZipEntry ze = new ZipEntry(fileNameInZip);
                zout.putNextEntry(ze);

                byte[] data = contentToWrite.getBytes();
                zout.write(data, 0, data.length);

                // send data to zout;
                zout.closeEntry();
                counter++;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            final File createTempFile = File.createTempFile("bla", ".epub");
            final FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(bout.toByteArray());
            fileOutputStream.close();

            // TODO valiate
            // simple constructor; errors are printed on stderr stream
            final EpubCheck epubcheck = new EpubCheck(createTempFile);
            // validate() returns true if no errors or warnings are found
            boolean result = epubcheck.validate();
            System.out.println("de.jos.freepaper.service.epub.EPubGenerator.generate() : " + result);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            out.write(bout.toByteArray());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
