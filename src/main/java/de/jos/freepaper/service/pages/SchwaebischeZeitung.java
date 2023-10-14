package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.List;

public class SchwaebischeZeitung extends SupportedPage {

    @Override
    public String getName() {
        return "schwaebische.de";
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
        final List<String> removableElements = super.getRemovableElements();
        removableElements.add("link[rel*='']");
        removableElements.add("script");
        removableElements.add("style");
        removableElements.add("svg");
        removableElements.add("img");
        removableElements.add("list");
        removableElements.add("figure");
        removableElements.add("picture");
        removableElements.add("figcaption");
        removableElements.add("button");
        removableElements.add("footer");
        removableElements.add(".sve-teaser_small");
        return removableElements;
    }

}