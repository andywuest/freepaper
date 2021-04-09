package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.Arrays;
import java.util.List;

public class Republik extends SupportedPage {

    @Override
    public String getName() {
        return "republik.ch";
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
        return Arrays.asList(
                "meta[content*='']", //
                "meta[name*='']", //
                "meta[link*='']", //
                "meta[property*='']", //
                "meta[http-equiv*='']", //
                "link[rel*='']", //
                "script", //
                "style", //
                "header", //
                "footer", //
                "iframe", //
                "svg", //
                "figure" //
        );
    }

}
