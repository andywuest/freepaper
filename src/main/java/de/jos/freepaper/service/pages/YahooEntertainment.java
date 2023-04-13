package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.List;

public class YahooEntertainment extends SupportedPage {

    @Override
    public String getName() {
        return "yahoo.com/entertainment";
    }

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public boolean supportsArticle() {
        return true;
    }

    @Override
    public List<String> getRemovableElements() {
        final List<String> elements = super.getRemovableElements();
        elements.add("meta[name*='']");
        elements.add("meta[http-equiv*='']");
        elements.add("meta[property*='']");
        elements.add("link[rel*='']");
        elements.add(".caas-share-section");
        elements.add("script");
        elements.add("style");
        elements.add("header");
        elements.add("footer");
        elements.add("template");
        elements.add("figure");
        elements.add("aside");
        elements.add("#module-moreStories");
        return elements;
    }

}
