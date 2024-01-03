package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.Arrays;
import java.util.List;

public class Capital extends SupportedPage {

    @Override
    public String getName() {
        return "capital.de";
    }

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public List<String> getRemovableElements() {
        final List<String> removableElements = super.getRemovableElements();
        removableElements.addAll(
                Arrays.asList(
                        "meta[name*='']", //
                        "meta[property*='']", //
                        "link[rel*='']", //
                        ".header page__header", //
                        "figure", //
                        "dialog", //
                        "img", //
                        ".header__meta", //
                        ".slide-navigation", //
                        ".ad-container", //
                        ".ad-placeholder", //
                        "header", //
                        ".footer", //
                        ".article__tags", //
                        "x-drawer", //
                        "x-bookmarkbutton", //
                        "x-snackbar", //
                        "x-token", //
                        ".article__sidebar", //
                        ".article__end", //
                        ".article__embedded-teasers" //

                )
        );
        return removableElements;
    }

}
