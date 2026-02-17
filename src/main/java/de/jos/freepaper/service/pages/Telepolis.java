package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.List;

public class Telepolis extends SupportedPage {

    @Override
    public String getName() {
        return "telepolis.de";
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
        elements.add("meta[http-equiv*='']");
        elements.add("link[rel*='']");
        elements.add("nav");
        elements.add("header");
        elements.add("footer");
        elements.add("a-collapse");
        elements.add("a-click-performance");
        elements.add("a-analytics");
        elements.add("a-script");
        elements.add("a-sticky-ad");
        elements.add("a-with-access");
        elements.add(".tpteaser");
        elements.add(".ad-label");
        elements.add(".ad-microsites");
        elements.add(".aside_teaser");
        return elements;
    }

}
