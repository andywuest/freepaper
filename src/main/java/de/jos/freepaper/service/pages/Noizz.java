package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import java.util.List;

/**
 *
 * @author awuest
 */
public class Noizz extends SupportedPage {

    @Override
    public String getName() {
        return "noizz.de";
    }

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public boolean removeEmptyTags() {
        return true;
    }

    @Override
    public List<String> getRemovableElements() {
        final List<String> elements = super.getRemovableElements();
        elements.add("meta[name*='']");
        elements.add("meta[property*='']");
        elements.add("link[rel*='']");
        elements.add("script");
        elements.add("noscript");
        elements.add("style");
        elements.add("svg");
        elements.add("img");
        elements.add("picture");
        elements.add("footer");
        elements.add("header");
        elements.add("symbol");
        elements.add(".menu");
        elements.add(".socialAuthor");
        elements.add(".breadcrumbs");
        elements.add(".articleTagsUl");
        elements.add(".rightColumn");
        return elements;
    }

}
