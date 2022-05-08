package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.Arrays;
import java.util.List;

/**
 * @author awuest
 */
public class StuttgarterZeitung extends SupportedPage {

    @Override
    public String getName() {
        return "stuttgarter-zeitung.de";
    }

    @Override
    public List<String> getRemovableElements() {
        return Arrays.asList( //
                "meta[name*='']", //
                "meta[content*='']", //
                "meta[property*='']", //
                "meta[http-equiv*='']", //
                "link[rel*='']", //
                "link", //
                "script", //
                "style", //
                "aside", //
                "noscript", //
                "figure", //
                "svg", //
                "img", //
                "nav", //
                "form", //
                "iframe", //
                "footer", //
                "dig-plugin", //
                "[data-noprint='true']", //
                "[style='display:none']", //
                ".mod-header-new", //
                ".bottom-nav", //
                ".art-tags" //
        );
    }

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public boolean removeAllLinks() {
        return true;
    }
}
