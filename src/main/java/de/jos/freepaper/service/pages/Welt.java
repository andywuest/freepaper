package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author awuest
 */
public class Welt extends SupportedPage {

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public String getName() {
        return "www.welt.de";
    }

    @Override
    public List<String> getRemovableElements() {
        final List<String> removableElements = super.getRemovableElements();
        removableElements.addAll(List.of(
                "meta[name*='']",
                "meta[property*='']",
                "meta[content*='']",
                "link[rel*='']",
                "nav",
                "footer",
                ".c-header-skiplinks",
                ".c-social-bar",
                ".r-header-top-right",
                ".c-oembed",
                ".c-inline-teaser-list"
        ));

//        return Arrays.asList(//
//          "meta[content*='']", //
//          "link[rel*='']", //
//          "script", //
//          "style", //
//          "noscript", //
//          "header", //
//          "video", //
//          "svg", //
//          "img", //
//          "figure", //
//          "picture", //
//          "#Comments", //
//          ".c-channel-header", //
//          ".c-inline-element", //
//          ".nocontent", //
//          ".c-content-slider", //
//          ".c-ad", //
//          ".c-breadcrumb", //
//          ".c-channel-navigation", //
//          ".c-social-bar__icon-link", //
//          ".c-breaking__fallback", //
//          ".ob-smartfeed-joker", //
//          ".c-page-header", //
//          ".o-teaser__title", //
//          ".OUTBRAIN", //
//          ".c-outbrain-widget__teasers", //
//          ".c-themepages", //
//          "footer" //
//          //"style" //
        return removableElements;
    }

}
