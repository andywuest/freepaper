package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.Arrays;
import java.util.List;

public class ForeignAffairs extends SupportedPage {

    @Override
    public String getName() {
        return "forbes.com";
    }

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public List<String> getRemovableElements() {
        // contains virtually no usable ids and classes :-(
        final List<String> result = super.getRemovableElements();
        result.addAll(Arrays.asList( //
                "meta[name*='']", //
                "meta[property*='']", //
                "meta[http-equiv*='']", //
                "link[rel*='']", //
                "style", //
                "header", //
                "footer", //
                "nav", //
                "svg", //
                "img", //
                "figure", //
                "script", //
                ".magazine-list-article--suggested", //
                ".magazine-list-article--summary", //
                ".loading-indicator", //
                ".most-read-articles", //
                ".article-footer-tags", //
                ".authors-bio__body", //
                ".paywall-prompt", //
                ".authors-bio", //
                ".article-newsletter-signup--container", //
                ".messages--container--bottom" //
        ));
        return result;
    }

}
