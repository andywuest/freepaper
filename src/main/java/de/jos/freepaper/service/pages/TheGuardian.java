package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import java.util.List;

/**
 *
 * @author awuest
 */
public class TheGuardian extends SupportedPage {

    @Override
    public String getName() {
        return "theguardian.com";
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
        elements.add("meta[name*='']");
        elements.add("meta[property*='']");
        elements.add("link[rel*='']");
        elements.add("script");
        elements.add("noscript");
        elements.add("style");
        elements.add("header");
        elements.add("figcaption");
        elements.add("picture");
        elements.add("figure");
        elements.add("img");
        elements.add("div[data-print-layout='hide']");
        elements.add(".submeta__links");
        elements.add(".submeta__links");
        elements.add(".element--thumbnail");
        elements.add(".social");
        elements.add(".syndication--bottom");
        return elements;
    }

}
