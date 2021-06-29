package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author awuest
 */
public class HeiseHintergrund extends SupportedPage {

    @Override
    public String getPrintURL(String url) {
        return url;
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
                "a-paternoster", //
                "time", //
                "figure", //
                "img", //
                "svg", //
                ".heisetopnavi_login", //
                ".heisetopnavi_hover_legacy", //
                ".readspeaker-link", //
                "#heisetopnavi_search", //
                ".main-header", //
                ".breadcrumb", //
                ".adbottom", //
                "#sitemap", //
                ".bottom_up", //
                "#navi_bottom", //
                "script", //
                "aside", //
                "noscript" //
        ));
        return result;
    }
}
