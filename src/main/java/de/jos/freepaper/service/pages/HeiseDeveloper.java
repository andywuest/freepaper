package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author awuest
 */
public class HeiseDeveloper extends SupportedPage {

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public String getName() {
        return "heise.de/developer";
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
                "footer", //
                "a-ad", // special tag
                "a-collapse", // special tag
                "a-script", // special tag
                "a-analytics", // special tag
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
                "#navi_bottom", //
                "script", //
                "aside", //
                "noscript" //
        ));
        return result;
    }
}
