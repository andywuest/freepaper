package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.Arrays;
import java.util.List;

public class TimSchaeferMedia extends SupportedPage {

    @Override
    public String getName() {
        return "timschaefermedia.com";
    }

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public boolean removeEmptyTags() {
        return true;
    }

    @Override
    public List<String> getRemovableElements() {
        // contains virtually no usable ids and classes :-(
        final List<String> result = super.getRemovableElements();
        result.addAll(Arrays.asList( //
                "meta[name*='']", //
                "meta[property*='']", //
                "meta[http-equiv*='']", //
                "link[rel*='']", //
                "#secondary", //
                "#comments", //
                "#wpd-bubble-wrapper", //
                "#wpd-editor-source-code-wrapper", //
                "#cmplz-cookiebanner-container", //
                "figure", //
                "header", //
                "footer", //
                "img", //
                ".cs-header__inner", //
                ".cs-entry__tags", //
                ".cs-entry__after-share-buttons", //
                ".cs-entry__post-related", //
                ".cs-meta-comments", //
                ".cs-meta-reading-time", //
                ".cs-offcanvas__sidebar", //
                ".cs-offcanvas", //
                ".cs-entry__metabar", //
                ".pk-mobile-share-overlay", //
                ".cs-offcanvas__nav" //
        ));
        return result;
    }

}
