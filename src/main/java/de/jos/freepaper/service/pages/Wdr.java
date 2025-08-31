package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.List;

/**
 *
 * @author awuest
 */
public class Wdr extends SupportedPage {

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public String getName() {
        return "wdr.de";
    }

    @Override
    public boolean supportsArticle() {
        return true;
    }

    @Override
    public List<String> getRemovableElements() {
        final List<String> removableElements = super.getRemovableElements();
        removableElements.addAll(List.of(
                        "link[rel*='']", //
                        "link[style*='']", //
                        "meta[property*='']", //
                        "meta[name*='']" //
                )
        );
        return removableElements;
    }
}
