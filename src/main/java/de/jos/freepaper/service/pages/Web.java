package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.Arrays;
import java.util.List;

public class Web extends SupportedPage {

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public String getName() {
        return "web.de";
    }

    @Override
    public boolean supportsArticle() {
        return true;
    }

    @Override
    public boolean removeAllLinks() {
        return super.removeAllLinks();
    }

    @Override
    public List<String> getRemovableElements() {
        final List<String> result = super.getRemovableElements();
        result.addAll(Arrays.asList(//
                "link[rel*='']", //
                "meta[name*='']", //
                "meta[property*='']", //
                "ui-social", //
                "ui-starpreview", //
                "ui-feedback", //
                "dialog", //
                "img", //
                ".p--contentbutton", //
                ".content__feedback", //
                ".teaser-full", //
                ".teaser-list-vertical", //
                ".article__transparencybox", //
                ".breadcrumb__top" //
        ));
        return result;
    }
}