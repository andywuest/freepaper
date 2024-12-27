package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.List;

public class Annabelle extends SupportedPage {

    @Override
    public String getName() {
        return "annabelle.ch";
    }

    @Override
    public String getPrintURL(String url) {
        return url;
    }


    @Override
    public List<String> getRemovableElements() {
        final List<String> removableElements = super.getRemovableElements();
        removableElements.add("link[rel*='']");
        removableElements.add("nav");
        removableElements.add("footer");
        removableElements.add(".post-header__credits");
        removableElements.add(".post-header__lead-block--social");
        removableElements.add(".post-header__social-wrapper--mobile");
        removableElements.add(".block-wysiwyg-infobox");
        removableElements.add(".block-quote");
        removableElements.add(".post-related");
        removableElements.add(".next-reads");
        removableElements.add(".block-ad");
        removableElements.add(".comments-area");
        removableElements.add(".teaser-vertical");
        return removableElements;
    }

    @Override
    public boolean supportsArticle() {
        return true;
    }

}