package de.jos.freepaper.service.download;

import de.jos.freepaper.Constants;
import de.jos.freepaper.service.config.ProxyConfiguration;
import de.jos.freepaper.service.SupportedPage;
import de.jos.freepaper.service.epub.StoryDto;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import org.apache.commons.lang3.StringUtils;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

/**
 *
 * @author awuest
 */
public class JSoupDownload {

    public Path performDownload(SupportedPage page, ProxyConfiguration proxyConfiguration, String url, String timestamp, ServletContext servletContext) {

        final String fileNamePrefix = String.format("ripped_page_%s", timestamp);

        Path path = null;
        try {
            path = Files.createTempFile(fileNamePrefix, ".html");
            System.out.println("Target file : " + path);

            final String urlToDownload = page.getPrintURL(url);

            System.out.println("Download URL : " + urlToDownload);

            Connection jsoupConnect = Jsoup.connect(urlToDownload);

            // add proxy if we have one
            if (proxyConfiguration != null) {
                System.out.println("Using Proxy ");
                jsoupConnect = jsoupConnect.proxy(proxyConfiguration.getProxyHost(), proxyConfiguration.getProxyPort()).timeout(10 * 1000);
            } else {
                System.out.println("Ignoring Proxy ");
                jsoupConnect = jsoupConnect.timeout(10 * 1000);
            }

            final Document doc = jsoupConnect.get();

            final Elements elementsByTag = doc.getElementsByTag("article");
            System.out.println("Number or article tags in document : " + elementsByTag.size());

            if (page.supportsArticle() && elementsByTag.size() == 1) {
                final Element articleNode = elementsByTag.get(0).clone();
                doc.body().empty();
                doc.body().appendChild(articleNode);
                System.out.println("Replace content with article node only !");

                // replace the div tags within the article with section tags
                // final Elements elements = doc.getElementsByTag("div").remove();
                // elements.tagName("section");
                doc.select("meta").remove();
            }

            System.out.println("===> Cleaning up document !");
            doc.select(StringUtils.join(page.getRemovableElements(), ", ")).remove();
            removeOnload(doc);

            // get title before we remove the attributes from the tags (fixes n-tv).
            System.out.println("title    : " + page.getTitle(doc));

            System.out.println("===> Removing all comments in doc !");
            removeComments(doc);

            System.out.println("===> Performing special logic !");
            page.executeSpecialLogicOnDocument(doc);

            System.out.println("===> Remove Attributes of Tag !");
            removeAllAttributesOfTag(doc, "a");
            removeAllAttributesOfTag(doc, "h1");
            removeAllAttributesOfTag(doc, "h2");
            removeAllAttributesOfTag(doc, "h3");
            removeAllAttributesOfTag(doc, "br");
            removeAllAttributesOfTag(doc, "body");
            removeAllAttributesOfTag(doc, "hr");
            removeAllAttributesOfTag(doc, "article");
            removeAllAttributesOfTag(doc, "header");
            removeAllAttributesOfTag(doc, "div");
            removeAllAttributesOfTag(doc, "span");
            removeAllAttributesOfTag(doc, "section");
            removeAllAttributesOfTag(doc, "i");
            removeAllAttributesOfTag(doc, "ul"); // handelsblatt
            removeAllAttributesOfTag(doc, "li"); // handelsblatt
            removeAllAttributesOfTag(doc, "p"); // handelsblatt
            removeAllAttributesOfTag(doc, "main"); // jetzt.de
            removeAllAttributesOfTag(doc, "time"); // bento.de
            removeAllAttributesOfTag(doc, "blockquote"); // focus.de - huffpost

            System.out.println("===> Remove all data- / itemprop attributes");
            removeAllAttributes(doc, "data-");
            removeAllAttributes(doc, "itemprop");

            // run the removable multiple times - to catch all empty tags
            int i = 0;
            while (i < 5) {
                int count = 0;

                boolean foundEmptyTags = false;
                if (page.removeEmptyTags()) {
                    for (Element element : doc.select("*")) {
                        if (!element.hasText() && element.isBlock() && !"meta".equalsIgnoreCase(element.nodeName())) {
                            System.out.println("removing " + element.nodeName());
                            element.remove();
                            foundEmptyTags = true;
                            count++;
                        }
                    }
                }
                
                System.out.println("Removing empty tags, round " + (i + 1) + " - removed " + count + " tags");
                
                if (foundEmptyTags) {
                    i++;
                } else {
                    break;
                }
            }

            // get document and replace all the link tags
            String html = doc.outerHtml();
            doc.outputSettings().indentAmount(0).prettyPrint(false);
            String htmlBodyOnly = doc.body().html();

            System.out.println("===> fixing broken tags ");
            htmlBodyOnly = htmlBodyOnly.replaceAll("<br>", "<br/>");
            htmlBodyOnly = htmlBodyOnly.replaceAll("<hr>", "<hr/>");
            htmlBodyOnly = htmlBodyOnly.replaceAll("<hr>", "<hr/>");

            // if we have an article - there must no div be contained
            if (page.supportsArticle() && elementsByTag.size() == 1) {
                System.out.println("===> remove invalid div tags - invalid ");
                htmlBodyOnly = htmlBodyOnly.replaceAll("<div>", "").replaceAll("</div>", ""); // i guess this div is valid !!
            }

            // generally invalid
            htmlBodyOnly = htmlBodyOnly.replaceAll("<section>", "").replaceAll("</section>", "");
            htmlBodyOnly = htmlBodyOnly.replaceAll("<article>", "").replaceAll("</article>", "");
            htmlBodyOnly = htmlBodyOnly.replaceAll("<header>", "").replaceAll("</header>", "");
            htmlBodyOnly = htmlBodyOnly.replaceAll("<main>", "").replaceAll("</main>", "");
            htmlBodyOnly = htmlBodyOnly.replaceAll("<time>", "").replaceAll("</time>", "");
            htmlBodyOnly = htmlBodyOnly.replaceAll("<h3>", "").replaceAll("</h3>", "");
            htmlBodyOnly = htmlBodyOnly.replaceAll("<cite>", "").replaceAll("</cite>", "");
            htmlBodyOnly = htmlBodyOnly.replaceAll("<jsp:text>", "").replaceAll("</jsp:text>", "").replaceAll("<jsp:text />", "");

            final HtmlCleanUp htmlCleanUp = new HtmlCleanUp();

            if (page.removeAllLinks()) {
                html = htmlCleanUp.removeAllLinks(html);
                htmlBodyOnly = htmlCleanUp.removeAllLinks(htmlBodyOnly);
            }

//            htmlBodyOnly = htmlBodyOnly.replaceAll("(?m)^[ \t]*\r?\n", "").replaceAll("\\s*\r?\n", "");

            htmlBodyOnly = htmlCleanUp.removeAllEmptyTags(htmlBodyOnly);

            System.out.println("document : \n" + html);
            System.out.println("document body : \n" + htmlBodyOnly);

            final String title = doc.title().replaceAll("&", "&amp;").replaceAll("\"", "&quot;");

            if (servletContext != null) {
                final StoryDto storyDto = new StoryDto(title, htmlBodyOnly, page.getName(), url);
                System.out.println("Created story - adding story to global list");
                final List<StoryDto> stories = (List<StoryDto>) servletContext.getAttribute(Constants.APP_CONTEXT_STORIES);
                stories.add(storyDto);
                System.out.println("List contains now " + stories.size() + " stories.");
            }

            System.out.println("===> Writing document !");
            try (Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path.toFile()), page.getCharset()))) {
                out.write(html);
            }

        } catch (IOException ex) {
            Logger.getLogger(JSoupDownload.class.getName()).log(Level.SEVERE, null, ex);
        }

        return path;
    }

    /**
     * Remove comments from node and child nodes: see
     * http://stackoverflow.com/questions/7541843/how-to-search-for-comments-using-jsoup
     *
     * @param node
     */
    private void removeComments(Node node) {
        for (int i = 0; i < node.childNodes().size();) {
            Node child = node.childNode(i);
            if (child.nodeName().equals("#comment")) {
                child.remove();
            } else {
                removeComments(child);
                i++;
            }
        }
    }

    private void removeOnload(Document doc) {
        final Element body = doc.body();
        if (body != null) {
            body.removeAttr("onload");
        }
    }

    private void removeAllAttributesOfTag(Document doc, String tagName) {
        doc.getElementsByTag(tagName).forEach(element -> {
            final Attributes attributes = element.attributes();
            if (attributes != null) {
                final List<String> attributeNames = new ArrayList<>();
                attributes.forEach(attr -> attributeNames.add(attr.getKey()));
                attributeNames.forEach(key -> element.removeAttr(key));
            }
        });
    }

    private void removeAllAttributes(Document doc, String attributePrefix) {
        doc.getAllElements().forEach(element -> {
            final Attributes attributes = element.attributes();
            if (attributes != null) {
                final List<String> attributeNames = new ArrayList<>();
                attributes.forEach(attr -> {
                    if (attr.getKey().startsWith(attributePrefix)) {
                        attributeNames.add(attr.getKey());
                    }
                });
                attributeNames.forEach(key -> element.removeAttr(key));
            }
        });
    }

}
