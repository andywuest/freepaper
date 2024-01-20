package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.Arrays;
import java.util.List;

public class Heute extends SupportedPage {

    @Override
    public String getName() {
        return "heute.at";
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
    public List<String> getRemovableElements() {
        final List<String> result = super.getRemovableElements();
        result.addAll(Arrays.asList( //
                "meta[name*='']", //
                "meta[property*='']", //
                "meta[content*='']", //
                "link[rel*='']", //
                "link[id*='']", //
                ".swiper", //
                ".sticky-outer-wrapper", //
                "svg", //
                "img", //
                "#page-header" //
        ));
        return result;
    }

}

