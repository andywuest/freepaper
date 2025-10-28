package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.Arrays;
import java.util.List;

public class GameStar extends SupportedPage {

    @Override
    public String getName() {
        return "gamestar.de";
    }

    @Override
    public boolean removeEmptyTags() {
        return true;
    }

    @Override
    public List<String> getRemovableElements() {
        final List<String> removableElements = super.getRemovableElements();
        removableElements.addAll(Arrays.asList(
                "meta[name*='']", //
                "meta[property*='']", //
                "meta[http-equiv*='']", //
                "link[rel*='']", //
                ".content-labels", //
                ".article-video", //
                ".spacer2x", //
                ".taglist", //
                ".toggle-group", //
                ".contentteaser", //
                ".wp-block-wbd-affiliate-widget", //
                "#cmp-content", //
                "#login-error-modal", //
                "template",
                "header",
                "footer"
        ));
        return removableElements;
    }


}
