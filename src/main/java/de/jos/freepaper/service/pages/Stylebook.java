package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import java.util.List;

/**
 *
 * @author awuest
 */
public class Stylebook extends SupportedPage {

    @Override
    public String getName() {
        return "stylebook.de";
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
        elements.add("style");
        elements.add("header");
        elements.add("noscript");
        elements.add("img");
        elements.add("figure");
        elements.add("aside");
        elements.add(".footer__headline");
        elements.add(".footer");
        elements.add(".shariff");
        elements.add("[class^=affiliate]");
        elements.add(".nav-bottom__list");
        elements.add(".mashsb-container");
        elements.add(".social-sharing-popup__container");
        return elements;
    }

}
