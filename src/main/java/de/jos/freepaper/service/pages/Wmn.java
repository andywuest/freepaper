package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.Arrays;
import java.util.List;

public class Wmn extends SupportedPage {

    @Override
    public String getPrintURL(final String url) {
        return url;
    }

    @Override
    public String getName() {
        return "wmn.de";
    }

    @Override
    public List<String> getRemovableElements() {
        final List<String> removableElements = super.getRemovableElements();
        removableElements.addAll(Arrays.asList(
                "meta[name*='']", //
                "meta[property*='']", //
                "meta[http-equiv*='']", //
                "link[rel*='']", //
                "nav", //
                "header", //
                "#mobile-sidebar-fallback", //
                "#desktop-sidebar-fallback", //
                ".skip-link", //
                ".wp-post-image", //
                ".yoast-table-of-contents", //
                ".wp-block-yoast-seo-related-links", //
                "footer" //
        ));

        return removableElements;
    }
}

