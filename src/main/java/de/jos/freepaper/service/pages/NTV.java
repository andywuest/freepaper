package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.Arrays;
import java.util.List;

/**
 * @author awuest
 */
public class NTV extends SupportedPage {

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public String getName() {
        return "n-tv.de";
    }

    @Override
    public List<String> getRemovableElements() {
        return Arrays.asList( //
                "meta[content*='']", //
                "link", //
                "base", //
                "iframe", //
                "script", //
                "noscript", //
                "figure", //
                "img", //
                "header", //
                "footer", //
                "interaction", //
                "nav", //
                "style", //
                "select", //
                ".article__share--meldung", //
                ".article__aside--extcontent", //
                ".article__aside--right", //
                ".article__tags", //
                ".article__related", //
                ".article__share-wrapper", //
                ".title--dark", //
                ".teaser--video", //
                ".article--video", //
                ".article__author", //
                ".article__audio-share", //
                "section.sitemap", //
                ".linklist", //
                ".newcontent-note", //
                ".sidebar" //
        );
    }

}
