package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.List;

public class EsslingerZeitung extends SupportedPage {

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public String getName() {
        return "esslinger-zeitung.de";
    }

    @Override
    public boolean supportsArticle() {
        return true;
    }

    @Override
    public List<String> getRemovableElements() {
        final List<String> elements = super.getRemovableElements();
        elements.add("link[rel*='']");
        elements.add("link[href*='']");
        elements.add("dig-plugin");
        elements.add("#article-social-bar");
        elements.add(".articleTeaser");
        elements.add(".article-related");
        elements.add(".article-social-bottom");
        elements.add(".article-bottom-wrapper");
        return elements;
    }

}
