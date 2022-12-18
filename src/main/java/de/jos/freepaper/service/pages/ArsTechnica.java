package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.Arrays;
import java.util.List;

public class ArsTechnica extends SupportedPage {

    @Override
    public String getName() {
        return "arstechnica.com";
    }

    @Override
    public boolean supportsArticle() {
        return true;
    }

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public List<String> getRemovableElements() {
        //return Collections.emptyList();
        final List<String> result = super.getRemovableElements();
        result.addAll(Arrays.asList( //
                "meta[name*='']", //
                "meta[property*='']", //
                "link", //
                "script", //
                "style", //
                "figure", //
                "#social-left", //
                "#social-footer", //
                "#article-footer-wrap", //
                ".story-sidebar", //
                ".article-author", //
                ".ad_wrapper", //
                ".ad_xrail", //
                "header", //
                "footer"
        ));
        return result;
    }

}
