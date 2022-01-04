package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

public class BleepingComputer extends SupportedPage {

    @Override
    public String getName() {
        return "bleepingcomputer.com";
    }

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public List<String> getRemovableElements() {
        final List<String> removableElements = super.getRemovableElements();
        removableElements.addAll(
                Arrays.asList( //
                        "meta[name*='']", //
                        "meta[property*='']", //
                        "meta[http-equiv*='']", //
                        "link[rel*='']", //
                        "script", //
                        "noscript", //
                        "header", //
                        "footer", //
                        "meta", //
                        ".bc_goto_top", //
                        ".bc_right_sidebar", //
                        ".bc_login_form", //
                        ".cz-breadcrumb-outer-wrapp", //
                        ".cz-related-article-wrapp", //
                        ".cz-story-navigation", //
                        ".cz-news-tags-wrap", //
                        ".cz-popup-bottom-wrapp", //
                        ".cz-popup-wrapp", //
                        "#comments", //
                        "#comment_form", //
                        "#pop_stories", //
                        "img" //
                ));
        return removableElements;
    }

    @Override
    public boolean removeAllLinks() {
        return true;
    }
}


