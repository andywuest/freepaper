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
    public boolean removeEmptyTags() {
        return true;
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
                "glomex-player", //
                "dig-plugin", //
                "footer", //
                "#stellenfeedwrapper", //
                "#article-social-bar", //
                ".articleTeaser", //
                ".m-topthemen", //
                ".mod-header-new", //
                ".ad", //
                ".footercontent", //
                ".breadcrumb" //
        ));
        return removableElements;
    }

    @Override
    public boolean removeAllLinks() {
        return true;
    }
}
