package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.List;

public class BerlinerZeitung extends SupportedPage {

    @Override
    public String getName() {
        return "berliner-zeitung.de";
    }

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public boolean removeAllLinks() {
        return true;
    }

    @Override
    public boolean removeEmptyTags() {
        return true;
    }

    @Override
    public boolean supportsArticle() {
        return true;
    }

    @Override
    public List<String> getRemovableElements() {
        List<String> removableElements = super.getRemovableElements();
        removableElements.add("link[rel*='']");
        removableElements.add("meta[name*='']");
        removableElements.add("meta[http-equiv*='']");
        removableElements.add("meta[property*='']");
        removableElements.add("meta[property*='']");
        removableElements.add("[class^=tags-widget_wrapper]");
        removableElements.add(".main-header-wrapper");
        removableElements.add(".o-footer");
        removableElements.add(".m-sidebartitle__text");
        removableElements.add(".teaser__img");
        removableElements.add(".sidebar-recommendations-wrapper");
        removableElements.add(".m-andre-title");
        removableElements.add(".recommended-mainlist-container");

        return removableElements;
    }

}

