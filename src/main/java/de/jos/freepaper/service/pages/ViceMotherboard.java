package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import java.util.List;

/**
 *
 * @author wuesand
 */
public class ViceMotherboard extends SupportedPage {

    @Override
    public String getName() {
        return "motherboard.vice.com";
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
        elements.add("style");
        elements.add(".social-list");
        elements.add(".article__embed");
        elements.add(".article-body__share-icons");
        elements.add(".topics");
        return elements;
    }    
    
}
