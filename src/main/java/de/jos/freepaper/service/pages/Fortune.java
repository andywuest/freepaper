package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.Arrays;
import java.util.List;

public class Fortune extends SupportedPage {

    @Override
    public String getName() {
        return "fortune.com";
    }

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public List<String> getRemovableElements() {
        final List<String> removableElements = super.getRemovableElements();
        removableElements.addAll(
                Arrays.asList(
                        "meta[name*='']", //
                        "meta[property*='']", //
                        "link[rel*='']", //
                        "#header-wrapper-id", //
                        ".latest-module", //
                        ".articleRedesign", //
                        "header", //
                        "ol", //
                        "img", //
                        "footer", //
                        "nav" //
                )
        );
        return removableElements;
    }

}
