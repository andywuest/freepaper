package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import java.util.List;

/**
 *
 * @author awuest
 */
public class VdiNachrichten extends SupportedPage {
    
    @Override
    public String getName() {
        return "vdi-nachrichten.com";
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
        elements.add("img");
        elements.add(".icon");
        return elements;
    }    
    
}
