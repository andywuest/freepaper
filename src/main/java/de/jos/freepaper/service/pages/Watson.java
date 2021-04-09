package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.List;

public class Watson extends SupportedPage {

    @Override
    public String getName() {
        return "watson.de";
    }

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public List<String> getRemovableElements() {
        final List<String> removableElements = super.getRemovableElements();
        removableElements.add("meta[name*='']");
        removableElements.add("meta[property*='']");
        removableElements.add("link[href*='']");
        removableElements.add("link");
        removableElements.add("script");
        removableElements.add("noscript");
        removableElements.add("img");
        removableElements.add(".mininavi");
        removableElements.add(".icons");
        removableElements.add(".inserttitle");
        removableElements.add(".alt_links");
        removableElements.add(".tagcloud");
        removableElements.add(".mainnavi");
        removableElements.add(".footerblock");
        removableElements.add("#headernavi");
        return removableElements;
    }
}
