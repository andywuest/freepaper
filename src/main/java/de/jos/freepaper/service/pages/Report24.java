package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.Arrays;
import java.util.List;

public class Report24 extends SupportedPage {

    @Override
    public String getName() {
        return "report24.news";
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
                "meta[link*='']", //
                "meta[http-equiv*='']", //
                "link[rel*='']", //
                "meta[property*='']", //
                "header", //
                "footer", //
                "nav", //
                "em", //
                ".elementor-author-box", //
                ".elementor-widget-sidebar" //
        ));
        return removableElements;
    }

}
