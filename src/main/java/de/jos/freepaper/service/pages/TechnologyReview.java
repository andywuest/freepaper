package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.List;

public class TechnologyReview extends SupportedPage {

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public String getName() {
        return "technologyreview.com";
    }

    @Override
    public List<String> getRemovableElements() {
        final List<String> elements = super.getRemovableElements();
        elements.add("link[rel*='']");
        elements.add("meta[property*='']");
        elements.add("meta[name*='']");
        elements.add("style");
        elements.add("script");
        elements.add("noscript");
        elements.add("footer");
        elements.add("aside");
        elements.add("button");
        elements.add("svg");
        elements.add("img");
        elements.add("figcaption");
        elements.add("figure");
        elements.add("div[class^=headerTemplate__]");
        elements.add("ul[class^=infiniteItemList__wrapper]");
        return elements;
    }

}
