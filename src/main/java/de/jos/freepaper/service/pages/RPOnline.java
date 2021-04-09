package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.Arrays;
import java.util.List;

/**
 * @author awuest
 */
public class RPOnline extends SupportedPage {

    @Override
    public String getName() {
        return "rp-online.de";
    }

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public List<String> getRemovableElements() {
        return Arrays.asList( //
                "link[rel*='']", //
                "link[id*='']", //
                "meta[name*='']", //
                "meta[property*='']", //
                "script", //
                "noscript", //
                "style", //
                "svg", //
                "img", //
                "figure", //
                "header", //
                ".park-portal", //
                ".park-social-buttons", //
                ".park-navigation", //
                ".park-action-buttons", //
                ".park-tab-container__items", //
                ".park-tab-container__tabs", //
                ".park-slider__arrow-nav", //
                ".park-article__action-buttons", //
                ".park-inline-teaser-image-list", //
                ".park-slider__list", //
                ".park-teaser-tiles__list", //
                ".park-comments", //
                ".park-section-breadcrumb__navigation", //
                ".park-teaser-collection__list", //
                ".park-teaser-grid-image-list", //
                ".park-floating-bell", //
                ".park-tags", //
                "button", //
                "footer"
        );
    }

}
