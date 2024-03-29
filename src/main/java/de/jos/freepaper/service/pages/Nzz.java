package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import java.util.List;

/**
 *
 * @author awuest
 */
public class Nzz extends SupportedPage {

    @Override
    public String getName() {
        return "nzz.ch";
    }

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public boolean removeEmptyTags() {
        return true;
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
        elements.add("link[rel*='']");
        elements.add("#header");
        elements.add("#footer");
        elements.add(".headline__meta");
        elements.add(".pageelement--moretosubject");
        elements.add(".q-chart");
        elements.add(".GoogleActiveViewElement");
        elements.add(".pageelement--newestarticle");
        elements.add(".flickity-enabled");
        elements.add(".games-widget");
        elements.add("svg");
        elements.add("flickity");
        elements.add("figure");
        elements.add("button");
        return elements;
    }
    
}
