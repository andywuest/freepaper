package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author awuest
 */
public class DrWindows extends SupportedPage {

    @Override
    public String getName() {
        return "drwindows.de";
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
                "style[type*='']", //
                "style", //
                "header", //
                "footer", //
                "script", //
                "img", //
                "form", //
                ".main-nav", //
                ".shariff-buttons", //
                ".recent-post-widget", //
                ".sidebar.right", //
                ".scVBConnectorCommentsList"
        ));
        return removableElements;
    }
}
