package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

public class EGovernmentComputing extends SupportedPage {

    @Override
    public Charset getCharset() {
        return StandardCharsets.UTF_8;
    }

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public String getName() {
        return "egovernment-computing.de";
    }

    public List<String> getRemovableElements() {
        final List<String> result = super.getRemovableElements();
        result.addAll(Arrays.asList( //
                "meta[name*='']", //
                "meta[property*='']", //
                "link[rel*='']", //
                "link[href*='']", //
                "script", //
                "noscript", //
                "header", //
                "footer", //
                "iframe", //
                "style", //
                "nav", //
                "comments", //
                "#advertisement_04", //
                ".inf-mainheader__wrapper-fixed", //
                ".inf-companies-rel__company", //
                ".inf-mainnav", //
                ".inf-related-teaser", //
                "figure", //
                "img" //
        ));
        return result;
    }

}
