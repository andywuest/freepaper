package de.jos.freepaper.service;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jsoup.nodes.Document;

/**
 *
 * @author awuest
 */
public abstract class SupportedPage {

    /**
     * The name of the page.
     */
    public abstract String getName();

    /**
     * The URL of the print page.
     */
    public abstract String getPrintURL(String url);

    /**
     * CSS Selector expression (JQuery) for elements that can be savely removed.
     *
     * @return CSS selector list.
     */
    public List<String> getRemovableElements() {
        return new ArrayList<>(Arrays.asList(
                "style",
                "script",
                "noscript",
                "iframe",
                "form",
                "noscript",
                "iframe",
                "button"
        ));
    }

    /**
     * Provides the charset of the page.
     *
     * @return The charset of the page.
     */
    public Charset getCharset() {
        return StandardCharsets.UTF_8;
    }

    /**
     * Does the URL match the given url.
     */
    public boolean matchesURL(String url) {
        return url.contains(getName());
    }

    /**
     * Provides the title of the document.
     *
     * @param doc The jsoup document.
     * @return The title String.
     */
    public String getTitle(Document doc) {
        return doc.title();
    }

    /**
     * Executes special logic on the document (e.g. de-obfuscation).
     *
     * @param doc The document to be handled.
     */
    public void executeSpecialLogicOnDocument(Document doc) {
        // by default do nothing
    }

    public boolean removeAllLinks() {
        return false;
    }
    
    public boolean supportsArticle() {
        return false;
    }
    
    public boolean removeEmptyTags() {
        return false;
    }
    
}
