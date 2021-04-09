package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * @author awuest
 */
public class Spiegel extends SupportedPage {

    @Override
    public Charset getCharset() {
        return StandardCharsets.ISO_8859_1;
    }

    @Override
    public String getPrintURL(String url) {
        return url.replaceAll(".html", "-druck.html");
    }

    @Override
    public String getName() {
        return "www.spiegel.de";
    }

    @Override
    public boolean supportsArticle() {
        return true;
    }

    @Override
    public boolean removeEmptyTags() {
        return true;
    }

    @Override
    public List<String> getRemovableElements() {
        final List<String> removableElements = super.getRemovableElements();
        removableElements.add("link[rel*='']");
        removableElements.add("script");
        removableElements.add("style");
        removableElements.add("svg");
        removableElements.add("img");
        removableElements.add("figure");
        removableElements.add("figcaption");
        removableElements.add("button");
        removableElements.add("footer");
        removableElements.add("aside");
        removableElements.add(".flex");
        return removableElements;
    }

}
