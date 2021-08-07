package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.Arrays;
import java.util.List;

public class TheSun extends SupportedPage {

    @Override
    public String getName() {
        return "thesun.co.uk";
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
        // contains virtually no usable ids and classes :-(
        final List<String> result = super.getRemovableElements();
        result.addAll(Arrays.asList( //
                "link[rel*='']", //
                "style", //
                "figure", //
                "noscript", //
                "script", //
                "#page-social", //
                ".article__meta", //
                ".breadcrumbs", //
                ".article-top-mobile__image-container", //
                ".tags--article", //
                ".rail--trending" //
        ));
        return result;
    }

}
