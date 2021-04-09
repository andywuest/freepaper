package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.Arrays;
import java.util.List;

/**
 * @author awuest
 */
public class ManagerMagazin extends SupportedPage {

    @Override
    public String getName() {
        return "manager-magazin.de";
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
        return Arrays.asList( //
                "meta[name*='']", //
                "link[rel*='']", //
                "script", //
                "noscript", //
                "style", //
                "svg", //
                "ul", //
                "img", //
                "figure", //
                "aside", //
                "section[data-app-hidden*='']", //
                "iframe", //
                "footer"
        );
    }

}
