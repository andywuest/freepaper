package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.Arrays;
import java.util.List;

public class BusinessInsiderCom extends SupportedPage {
    @Override
    public String getName() {
        return "businessinsider.com";
    }

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public List<String> getRemovableElements() {
        return Arrays.asList( //
                "meta[name*='']", //
                "meta[property*='']", //
                "meta[http-equiv*='']", //
                "link[rel*='']", //
                "script", //
                "noscript", //
                "style", //
                "header", //
                "figure", //
                "nav", //
                "button", //
                "svg", //
                "form", //
                "img", //
                "iframe", //
                "back-to-home", //
                "#account-creation-component", //
                ".prebid-helper", //
                ".ad-callout-wrapper", //
                ".sticky-rail-ad-container", //
                ".error-request-message", //
                ".jumper style-loading", //
                ".live-updates-module", //
                ".twitter-tweet", //
                ".jumper", //
                ".share-wrapper", //
                ".share-link", //
                ".linkset-shim", //
                ".post-content-more", //
                ".notification-prompt-wrapper", //
                ".category-wrapper", //
                ".post-content-bottom", //
                "footer"
        );
    }

}
