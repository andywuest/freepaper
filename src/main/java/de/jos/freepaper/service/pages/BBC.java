package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.Arrays;
import java.util.List;

/**
 * @author awuest
 */
public class BBC extends SupportedPage {

    @Override
    public String getName() {
        return "bbc.com";
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
        return Arrays.asList( //
                "meta[name*='']", //
                "meta[property*='']", //
                "link[rel*='']", //
                "script", //
                "picture", //
                "noscript", //
                "section", //
                "header", //
                "style", //
                "figure", //
                ".article-share-tools"
        );
    }

}
