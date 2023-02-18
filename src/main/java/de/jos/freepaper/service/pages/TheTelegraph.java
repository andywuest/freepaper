package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.Arrays;
import java.util.List;

public class TheTelegraph extends SupportedPage {

    @Override
    public String getName() {
        return "thesun.co.uk";
    }

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public List<String> getRemovableElements() {
        final List<String> removableElements = super.getRemovableElements();
        removableElements.addAll(Arrays.asList(
                        "meta[http-equiv*='']", //
                        "meta[name*='']", //
                        "meta[property*='']", //
                        "meta[content*='']", //
                        "link[rel*='']", //
                        "link[href*='']", //
                        "script", //
                        "noscript", //
                        "header", //
                        "footer", //
                        "figure", //
                        "style", //
                        "aside", //
                        "svg", //
                        ".related-topics", //
                        ".e-social-share", //
                        ".site-header-wrapper", //
                        ".article-body-image__container" //
                )

        );
        return removableElements;
    }

}
