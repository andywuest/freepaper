package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.List;

public class EuroAmSonntag extends SupportedPage {

    @Override
    public String getName() {
        return "eurams.de";
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
        elements.add("link[rel*='']");
        elements.add("meta[name*='']");
        elements.add("link[href*='']");
        elements.add("meta[property*='']");
        elements.add("meta[property*='']");
        elements.add("header");
        elements.add("footer");
        elements.add("#flyin-banner");
        elements.add(".article-detail-sidebar");
        return elements;
    }

}
