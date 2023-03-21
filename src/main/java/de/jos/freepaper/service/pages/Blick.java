package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.Arrays;
import java.util.List;

public class Blick extends SupportedPage {

    @Override
    public String getName() {
        return "blick.ch";
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
                "style", //
                "script", //
                "noscript", //
                "nav", //
                "svg", //
                "header", //
                "footer", //
                "aside", //
                "button", //
                "picture", //
                "iframe", //
                "ol", //
                "a", //
                "img" //
        );
    }

}