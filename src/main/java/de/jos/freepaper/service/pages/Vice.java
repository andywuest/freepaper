package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.List;

/**
 *
 * @author wuesand
 */
public class Vice extends SupportedPage {

    @Override
    public String getName() {
        return "www.vice.com";
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
        elements.add("meta[http-equiv*='']");
        elements.add("link[href*='']");
        elements.add("script");
        elements.add("noscript");
        elements.add("figure");
        elements.add("img");
        elements.add("svg");
        elements.add("style");
        elements.add("nav");
        elements.add("footer");
        elements.add(".article__header__rubric");
        elements.add(".abc__quote");
        elements.add(".article__tagged");
        elements.add(".body-image__link");
        elements.add(".article__header__ad-section");
        elements.add(".article__header__datebar");
        elements.add(".article-newsletter-signup");
        elements.add(".article__longform__tags");
        elements.add(".smart-header__hed");
        elements.add("picture");
        return elements;
    }    
    
}
