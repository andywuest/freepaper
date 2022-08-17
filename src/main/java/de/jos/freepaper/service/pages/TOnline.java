package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.List;

public class TOnline extends SupportedPage {

    @Override
    public String getName() {
        return "t-online.de";
    }

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public List<String> getRemovableElements() {
        final List<String> elements = super.getRemovableElements();
        elements.add("meta[name*='']");
        elements.add("meta[property*='']");
        elements.add("link[rel*='']");
        elements.add("script");
        elements.add("header");
        elements.add("footer");
        elements.add("figure");
        elements.add("svg");
        elements.add("input");
        elements.add("iframe");
        elements.add("hr");
        elements.add("next-route-announcer");
        elements.add("li[class^=css]");
        elements.add("div[data-testid=article-trust]");
        elements.add("div[data-testid=StreamLayout.Companion]");
        elements.add("div[data-testid=ArticleBottomDivMarker]");
        elements.add("div[data-testid=PageFooter]");
        elements.add("div[data-testid=Breadcrumb]");
        elements.add("noscript");
        elements.add("style");
        elements.add("img");

        return elements;
    }

}
