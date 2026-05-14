package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.List;

public class Wired extends SupportedPage {

    @Override
    public String getName() {
        return "www.wired.com";
    }

    @Override
    public boolean removeEmptyTags() {
        return true;
    }

    @Override
    public List<String> getRemovableElements() {
        final List<String> removableElements = super.getRemovableElements();
        removableElements.addAll(List.of(
                        "link[rel*='']", //
                        "link[style*='']", //
                        "meta[property*='']", //
                        "meta[name*='']", //
                        "header", //
                        "footer", //
                        "nav",
                        "#CommentingMainContent",
                        ".ad__slot", //
                        ".OneNavContainer", //
                        "div[class^='DrawerWrapper']",
                        "div[class^='LinkStackWrapper']",
                        "div[class^='ContributorsWrapper']",
                        "div[class^='TagCloudWrapper']",
                        "div[class^='SummaryCollectionGridContent']",
                        "div[class^='CNCouponsWrapper']",
                        "aside[class^='PaywallBarWrapper']",
                        "aside[class^='PaywallInlineBarrierWrapper']",
                        "aside[class^='PaywallModalWrapper']"
                )
        );
        return removableElements;
    }

}
