package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.Arrays;
import java.util.List;

public class BusinessInsider extends SupportedPage {

    @Override
    public String getName() {
        return "businessinsider.de";
    }

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public List<String> getRemovableElements() {
        return Arrays.asList( //
                "meta[name*='']", //
                "meta[property*='']", //
                "meta[http-equiv*='']", //
                "link[rel*='']", //
                "script", //
                "style", //
                "aside", //
                "noscript", //
                "header", //
                "footer", //
                "figure", //
                "form", //
                "img", //
                ".bulletpoint-list", //
                ".related-wrap", //
                ".adup-wrap", //
                ".tags-wrap", //
                ".social-wrap" //
        );
    }

}
