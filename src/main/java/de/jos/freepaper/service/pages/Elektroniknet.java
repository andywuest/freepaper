package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.List;

public class Elektroniknet extends SupportedPage {

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public String getName() {
        return "elektroniknet.de";
    }

    @Override
    public List<String> getRemovableElements() {
        final List<String> elements = super.getRemovableElements();
        elements.add("link[rel*='']");
        elements.add("meta[name*='']");
        elements.add("meta[property*='']");
        elements.add("style");
        elements.add("script");
        elements.add("figure");
        elements.add("img");
        elements.add("header");
        elements.add("footer");
        elements.add("nav");
        elements.add("input");
        elements.add("label");
        elements.add(".sidebar");
        elements.add(".article__heading-related");
        elements.add(".columns--social");
        elements.add(".box");
        return elements;
    }

}
