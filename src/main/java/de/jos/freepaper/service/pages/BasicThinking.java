package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.Arrays;
import java.util.List;

public class BasicThinking extends SupportedPage {

    @Override
    public String getName() {
        return "basicthinking.de";
    }

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public List<String> getRemovableElements() {
        final List<String> removableElements = super.getRemovableElements();
        removableElements.addAll(Arrays.asList(
                "link[rel*='']",
                "meta[property*='']", //
                "meta[name*='']", //
                "footer",
                "#site-header",
                "#rb-user-popup-form",
                ".comment-box-wrap",
                ".l-shared-sec",
                ".e-shared-sec",
                ".feat-caption",
                ".p-categories",
                ".usr-holder",
                ".single-footer",
                ".sidebar-wrap",
                ".redaktion-newsletter",
                ".entry-bottom"
        ));
        return removableElements;
    }

}
