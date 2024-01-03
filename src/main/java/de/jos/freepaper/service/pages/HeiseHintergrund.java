package de.jos.freepaper.service.pages;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author awuest
 */
public class HeiseHintergrund extends AbstractHeise {

    @Override
    public String getPrintURL(String url) {
        return url + "?view=print";
    }

    @Override
    public String getName() {
        return "heise.de/hintergrund";
    }

    @Override
    public boolean supportsArticle() {
        return true;
    }

    @Override
    public List<String> getRemovableElements() {
        //return Collections.emptyList();
        final List<String> result = super.getRemovableElements();
        result.addAll(Arrays.asList( //
                "meta[name*='']", //
                "meta[property*='']", //
                "link[rel*='']", //
                "header", //
                "footer", //
                "style", //
                "a-ad", // special tag
                "a-script", // special tag
                "a-analytics", // special tag
                "a-collapse", // special tag
                "a-teaser", // special tag
                "a-lightbox", // special tag
                "a-login", //
                "a-sticky-footer", //
                "a-paternoster", //
                "a-opt-in", //
                "time", //
                "figure", //
                "img", //
                "svg", //
                "template", //
                ".heisetopnavi_login", //
                ".heisetopnavi_hover_legacy", //
                ".readspeaker-link", //
                "#heisetopnavi_search", //
                ".main-header", //
                ".breadcrumb", //
                ".adbottom", //
                "#sitemap", //
                ".bottom_up", //
                "embetty-tweet", //
                "#navi_bottom", //
                "script", //
                "aside", //
                "noscript" //
        ));
        return result;
    }
}
