package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.Arrays;
import java.util.List;

public class GamesIndustry extends SupportedPage {

    @Override
    public String getName() {
        return "www.gamesindustry.biz";
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
        final List<String> removableElements = super.getRemovableElements();
        removableElements.addAll(Arrays.asList(
                "meta[name*='']", //
                "meta[link*='']", //
                "meta[http-equiv*='']", //
                "link[rel*='']", //
                "meta[property*='']" //
        ));
        return removableElements;
    }

}
