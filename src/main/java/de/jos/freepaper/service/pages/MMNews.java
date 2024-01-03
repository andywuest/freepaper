package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.Arrays;
import java.util.List;

/**
 * @author awuest
 */
public class MMNews extends SupportedPage {

    @Override
    public String getName() {
        return "mmnews.de";
    }

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public boolean supportsArticle() {
        return true;
    }

    @Override
    public boolean removeEmptyTags() {
        return true;
    }

    @Override
    public List<String> getRemovableElements() {
        final List<String> result = super.getRemovableElements();
        result.addAll(Arrays.asList( //
                "meta[name*='']", //
                "meta[property*='']", //
                "base[href*='']", //
                "link[href*='']", //
                "a[target=_blank]", //
                "style", //
                "center", //
                ".a2a_kit", //
                ".sp-right", //
                ".sp-left", //
                "script", //
                ".clr", //
                ".article-footer-wrap", //
                ".article-info-wrapper", //
                "#yes-invest-inhalte", //
                ".jwDisqusForm", //
                "#taboola-below-article-thumbnails",
                "ins", //
                "img", //
                "center", //
                "u", //
                "ul" //
        ));
        return result;
    }

}
