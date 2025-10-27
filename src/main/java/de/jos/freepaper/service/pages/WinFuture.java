package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.List;

public class WinFuture extends SupportedPage {

    @Override
    public String getName() {
        return "winfuture.de";
    }

    @Override
    public List<String> getRemovableElements() {
        final List<String> removableElements = super.getRemovableElements();
        removableElements.addAll(List.of(
                        "link[rel*='']", //
                        "link[style*='']", //
                        "meta[property*='']", //
                        "meta[name*='']", //
                        "#header", //
                        "#rightWrap", //
                        "#comments_box", //
                        "#footer", //
                        ".comment_write_form", //
                        ".social_link_comment", //
                        ".changelog_list",
                        ".more_links",
                        ".mark_highlights",
                        ".social_link_hint",
                        ".summary_box"
                )
        );
        return removableElements;
    }


}
