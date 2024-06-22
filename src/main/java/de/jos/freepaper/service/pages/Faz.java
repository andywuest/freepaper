package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.List;

/**
 * Incredible bad HTML markup - not infos in the div tags :-(
 *
 * @author awuest
 */
public class Faz extends SupportedPage {

    @Override
    public String getName() {
        return "faz.net";
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
        elements.add("link[rel*='']");
        elements.add("meta[name*='']");
        elements.add("meta[property*='']");
        elements.add("script");
        elements.add("style");
        elements.add("svg");
        elements.add("figure");
        elements.add("em");
        elements.add("picture");
        elements.add("footer");
        elements.add(".hidden");
        elements.add(".mm-adbox");
        elements.add(".header-detail");
        elements.add(".header-teaser__image-details");
        elements.add(".footer-source");
        elements.add(".article-footer");
        elements.add(".related-articles");
        return elements;
    }

}
