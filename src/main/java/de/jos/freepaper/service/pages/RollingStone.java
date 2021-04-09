package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author wuesand
 */
public class RollingStone extends SupportedPage {

    @Override
    public String getName() {
        return "rollingstone.com";
    }

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public List<String> getRemovableElements() {
        return Arrays.asList(
                "meta[content*='']", //
                "meta[name*='']", //
                "meta[property*='']", //
                "link", //
                "script", //
                "svg", //
                "noscript", // 
                "figure", // 
                "iframe", //
                ".lead", //
                ".article-body-content-main-photo-caption", //
                ".module-trending-bar", //
                ".module-related", //
                ".right-rail", //
                ".ad-slot", //
                ".ad-container", //
                ".lightbox", //
                "#module-more-news", //
                "#content-card-footer", //
                "footer", //
                "header" //
        );
    }

}
