package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import java.util.List;

/**
 * @author awuest
 */
public class Orf extends SupportedPage {

    @Override
    public String getName() {
        return "orf.at";
    }

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public List<String> getRemovableElements() {
        final List<String> result = super.getRemovableElements();
        result.add("meta[name*='']");
        result.add("meta[property*='']");
        result.add("link[rel*='']");
        result.add("header");
        result.add("script");
        result.add("nav");
        result.add("figure");
        result.add("blockquote");
        result.add("#more-to-read");
        result.add(".story-footer");
        result.add(".embed twitter");
        result.add(".linkcard");
        result.add(".social-buttons");
        result.add("footer");
        return result;
    }

}
