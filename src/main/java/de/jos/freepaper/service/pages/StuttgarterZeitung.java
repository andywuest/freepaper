package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.Arrays;
import java.util.List;

/**
 * @author awuest
 */
public class StuttgarterZeitung extends SupportedPage {

    @Override
    public String getName() {
        return "stuttgarter-zeitung.de";
    }

    @Override
    public List<String> getRemovableElements() {
        final List<String> removableElements = super.getRemovableElements();
        removableElements.addAll(Arrays.asList( //
                "meta[name*='']", //
                "meta[content*='']", //
                "meta[property*='']", //
                "meta[http-equiv*='']", //
                "link[rel*='']", //
                "link", //
                "aside", //
                "svg", //
                "nav", //
                "glomex-player", //
                "template", //
                "footer", //
                "dig-plugin", //
                "[data-noprint='true']", //
                "[style='display:none']", //
                ".mod-header-new", //
                ".recoTeaserContainer", //
                ".bottom-nav", //
                ".article-bottom", //
                ".gallerybutton", //
                ".art-tags" //
        ));
        return removableElements;
    }

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public boolean removeAllLinks() {
        return true;
    }
}
