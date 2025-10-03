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
    public boolean supportsArticle() {
        return true;
    }

    @Override
    public List<String> getRemovableElements() {
        final List<String> result = super.getRemovableElements();
        result.addAll(Arrays.asList( //
                "link[rel*='']", //
                "meta[name*='']", //
                "meta[property*='']", //
                ".not-prose", //
                "nav", //
                "aside" //
        ));
        return result;
    }

}
