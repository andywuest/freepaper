package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.List;

public class PCGamer extends SupportedPage {

    @Override
    public String getName() {
        return "pcgamer.com";
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
        elements.add("link[href*='']");
        elements.add("nav");
        elements.add("footer");
        elements.add("#affiliate-disclaimer");
        elements.add("#slice-container-moreAbout");
        elements.add(".slice-container");
        elements.add(".jump-to-comments");
        elements.add(".related-articles-block");
        return elements;
    }

}