package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.Arrays;
import java.util.List;

public class Deutschlandfunk extends SupportedPage {

    @Override
    public String getName() {
        return "deutschlandfunk.de";
    }

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public List<String> getRemovableElements() {
        final List<String> removableElements = super.getRemovableElements();
        removableElements.addAll(Arrays.asList(
                "meta[name*='']", //
                "meta[property*='']", //
                "link[rel*='']", //
                "script", //
                "noscript", //
                "section", //
                "header", //
                "footer", //
                "nav", //
                ".dlf-articlesocial", //
                ".articleside", //
                ".dlf-breadcrumb", //
                ".dlf-search", //
                ".dlf-date", //
                ".dlf-navibar", //
                ".audiothek-link", //
                ".largeImage", //
                ".deutschlandfunkblock" //
        ));
        return removableElements;
    }

}
