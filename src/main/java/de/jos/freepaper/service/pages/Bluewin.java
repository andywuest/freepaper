package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.Arrays;
import java.util.List;

public class Bluewin extends SupportedPage {

    @Override
    public String getName() {
        return "bluewin.ch";
    }

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public List<String> getRemovableElements() {
        final List<String> result = super.getRemovableElements();
        result.addAll(Arrays.asList(
                "link", //
                "meta[name*='']", //
                "meta[property*='']", //
                "script", //
                "noscript", //
                "figcaption", //
                "picture", //
                "o-header-new", //
                ".o-sidebar", //
                ".m-socialheader__sharing", //
                ".m-content-list", //
                ".m-content-list__title", //
                ".m-content-list__list", //
                ".m-navigroup", //
                ".m-navigroup__container", //
                ".acm_floating", //
                ".sidebar", //
                ".ad-welcome-ad", //
                ".ad-rectangle", //
                ".ads-group", //
                ".h-m-teaser--inline", //
                ".js-video-autoplay",
                ".audienzz-suggestions", //
                "#gb_discussions", //
                "figure", //
                "footer"
        ));
        return result;
    }
}
