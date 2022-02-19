package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.Arrays;
import java.util.List;

public class SWR extends SupportedPage {

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public String getName() {
        return "www.swr.de";
    }

    @Override
    public List<String> getRemovableElements() {
        final List<String> removableElements = super.getRemovableElements();
        removableElements.addAll(Arrays.asList(
                        "meta[http-equiv*='']", //
                        "meta[name*='']", //
                        "meta[property*='']", //
                        "meta[content*='']", //
                        "link[rel*='']", //
                        "link[href*='']", //
                        "script", //
                        "style", //
                        "nav", //
                        "figure", //
                        "#header-main-navi-nav", //
                        "#playerbar", //
                        "#skippy", //
                        "#footer", //
                        ".breadcrumbs", //
                        ".meta-description", //
                        ".meta-authors", //
                        ".teaser", //
                        ".big-footer", //
                        ".tagleiste", //
                        ".relatedcontent", //
                        ".sharing", //
                        ".sharing-buttons", //
                        "footer" //
                )

        );
        return removableElements;
    }

}
