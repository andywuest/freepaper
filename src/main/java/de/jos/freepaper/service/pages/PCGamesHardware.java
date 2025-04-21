package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.Arrays;
import java.util.List;

public class PCGamesHardware extends SupportedPage {

    @Override
    public String getName() {
        return "pcgameshardware.de";
    }

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public boolean supportsArticle() {
        return true;
    }

    @Override
    public List<String> getRemovableElements() {
        final List<String> removableElements = super.getRemovableElements();
        removableElements.addAll(Arrays.asList(
                "link[rel*='']",
                "meta[property*='']", //
                "meta[name*='']", //
                "aside",
                ".Breadcrumb",
                ".ame-wrapper",
                ".relatedTopicsWrapper",
                ".artSocialLinks",
                ".stickyParent",
                ".anchorHeadline"
        ));
        return removableElements;
    }

}
