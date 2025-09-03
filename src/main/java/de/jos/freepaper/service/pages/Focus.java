package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * @author awuest
 */
public class Focus extends SupportedPage {

    @Override
    public String getName() {
        return "focus.de";
    }

    @Override
    public boolean removeAllLinks() {
        return true;
    }

    @Override
    public Charset getCharset() {
        return StandardCharsets.ISO_8859_1;
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
        removableElements.add("meta[name*='']");
        removableElements.add("meta[property*='']");
        removableElements.add("meta[name*='']");
        removableElements.add("link[rel*='']");
        removableElements.add(".Article-Overhead");
        removableElements.add(".Ad-Slot");
        removableElements.add(".Social-Sharing-Container");
        removableElements.add(".Ad-Slot-Sticky-Container");
        removableElements.add(".Article-Content-Ad-Carousel");
        removableElements.add(".Article-ReusableText");
        return removableElements;
    }

}
