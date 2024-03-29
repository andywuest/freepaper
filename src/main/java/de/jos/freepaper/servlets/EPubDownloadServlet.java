package de.jos.freepaper.servlets;

import de.jos.freepaper.Constants;
import de.jos.freepaper.service.epub.EPubGenerator;
import de.jos.freepaper.service.epub.StoryDto;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author wuesand
 */
public class EPubDownloadServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        final List<StoryDto> stories = (List<StoryDto>) request.getServletContext().getAttribute(Constants.APP_CONTEXT_STORIES);

        final EPubGenerator generator = new EPubGenerator();

        response.setContentType("application/epub+zip");

        final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd_HH-mm");
        final String fileName = MessageFormat.format("FreePaper_{0}.epub", new Object[]{sdf.format(new Date())});

        // Make sure to show the download dialog
        response.setHeader("Content-disposition", "attachment; filename=" + fileName);

        try (final ServletOutputStream outputStream = response.getOutputStream()) {
            generator.generate(stories, outputStream);
            outputStream.flush();
        }
    }

}
