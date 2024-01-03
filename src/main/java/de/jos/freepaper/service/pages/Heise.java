package de.jos.freepaper.service.pages;

import java.util.Arrays;
import java.util.List;

/**
 * @author awuest
 */
public class Heise extends AbstractHeise {

    @Override
    public String getPrintURL(String url) {
        return url + "?view=print";
    }

    @Override
    public String getName() {
        return "heise.de/news";
    }

    @Override
    public boolean supportsArticle() {
        return true;
    }

    @Override
    public boolean removeAllLinks() {
        return true;
    }

    @Override
    public List<String> getRemovableElements() {
        return Arrays.asList( //              
                "meta[name*='']", //
                "link[rel*='']", //
                "footer", //
                "figure", //
                "script", //
                "style", //
                "noscript", //
                "time", //
                "inline", //
                "embetty-tweet", //
                "embetty-tweet", //
                "figcaption", //
                ".leaderboard_print", //
                ".opt-in__cta-container", //
                ".printversion--hide", //
                ".printversion__copyright", //
                "img", //
                "svg", //
                ".size80", //
                "#navi_bottom", //
                ".heisetopnavi", //
                ".image-num", //
                ".ISI_IGNORE"
        );
    }

}
