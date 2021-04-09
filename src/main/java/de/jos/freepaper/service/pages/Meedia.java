package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import java.util.List;

/**
 *
 * @author wuesand
 */
public class Meedia extends SupportedPage {

    @Override
    public String getName() {
        return "meedia.de";
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
        elements.add("link[rel*='']");
        elements.add("script");
        elements.add("noscript");
        elements.add("img");
        elements.add("header");
        elements.add("footer");
        elements.add("form");
        elements.add("figure");
        elements.add("style");
        elements.add("#newsletter-teaser");
        elements.add("#menu-footer-network-nav");
        elements.add(".ph-teaser__list");
        elements.add(".grid-box-sidebar");
        elements.add(".entry-meta-tag-list");
        elements.add(".entry-social");
        elements.add(".comment-list");
        elements.add(".shiftnav-menu-title");
        elements.add(".shiftnav-nav");
        return elements;
    }    
    
}
