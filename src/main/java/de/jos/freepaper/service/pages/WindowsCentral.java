package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.Arrays;
import java.util.List;

public class WindowsCentral extends SupportedPage {

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public boolean supportsArticle() {
        return true;
    }

    @Override
    public String getName() {
        return "windowscentral.com";
    }

    @Override
    public List<String> getRemovableElements() {
        final List<String> removableElements = super.getRemovableElements();
        removableElements.addAll(Arrays.asList(
                "meta[name*='']", //
                "meta[property*='']", //
                "link[rel*='']", //
                "header",
                "#articleTag",
                "#viafoura-comments-container",
                ".slice-author-bio",
                ".slice-container-newsletterForm",
                "#popular-data",
                "#follow-us-on-google-news",
                ".hawk-load-more-container",
                ".hawk-footer-container",
                ".hawk-main-editorial-container",
                "aside"
        ));

        return removableElements;
    }

}
