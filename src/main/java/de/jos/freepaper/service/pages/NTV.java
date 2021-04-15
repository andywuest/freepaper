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
                "header", //
                "footer", //
                "nav", //
                "style", //
                ".article__share--meldung", //
                ".article__aside--extcontent", //
                ".article__aside--right", //
                ".article__tags", //
                ".article__related", //
                ".title--dark", //
                ".teaser--video", //
                ".article__author", //
                "section.sitemap", //
                ".sidebar" //
        );
    }

}
