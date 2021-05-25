package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.ArrayList;
import java.util.List;

public class NDR extends SupportedPage {

    @Override
    public String getName() {
        return "ndr.de";
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
        List<String> removableElements = new ArrayList<>();
        removableElements.add("link[rel*='']");
        removableElements.add("script");
        removableElements.add("img");
        removableElements.add("svg");
        removableElements.add(".boxhead");
        removableElements.add(".teaser");
        removableElements.add("#printbox");
        return removableElements;
    }

}
