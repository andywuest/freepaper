package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.Arrays;
import java.util.List;

public class Morgenpost extends SupportedPage {

    @Override
    public String getName() {
        return "morgenpost.de";
    }

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public List<String> getRemovableElements() {
        final List<String> result = super.getRemovableElements();
        result.addAll(Arrays.asList( //
                "meta[name*='']", //
                "link[rel*='']", //
                "style", //
                "script", //
                "noscript", //
                "header", //
                "aside", //
                "nav", //
                "figure", //
                "iframe", //
                ".mwPlayerContainer", //
                ".abo-login", //
                ".content--teaser--container", //
                "footer" //
        ));
        return result;
    }


}
