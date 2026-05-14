package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.List;

public class Fool extends SupportedPage {

    @Override
    public String getName() {
        return "www.fool.com";
    }

    @Override
    public boolean removeEmptyTags() {
        return true;
    }

    @Override
    public boolean removeAllLinks() {
        return true;
    }

    @Override
    public List<String> getRemovableElements() {
        final List<String> removableElements = super.getRemovableElements();
        // "ticker-bar"
        removableElements.addAll(List.of( //
                "meta[name*='']", //
                "meta[property*='']", //
                "meta[http-equiv*='']", //
                "link[rel*='']", //
                "#accessibility-banner", //
                "#foolcom_nav_button_container", //
                "#company-search-label", //
                "footer", //
                "nav", //
                "article", //
                ".image-container", //
                ".image", //
                ".hidden", //
                ".shadow-card", //
                ".premium-investing-services", //
                ".ticker-bar" //
        ));
        return removableElements;
    }

}

