package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.Arrays;
import java.util.List;

public class Gmx extends SupportedPage {

    @Override
    public String getName() {
        return "gmx.net";
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
        final List<String> removableElements = super.getRemovableElements();
        removableElements.addAll(Arrays.asList(
                "link",
                "ui-social",
                "ui-infobox",
                "ui-feedback",
                ".teaser-full",
                ".content__feedback",
                ".article__transparencybox"
        ));
        return removableElements;
    }

}
