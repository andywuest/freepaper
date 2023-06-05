package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.Arrays;
import java.util.List;

public class BW24 extends SupportedPage {

    @Override
    public String getName() {
        return "bw24.de";
    }

    @Override
    public boolean supportsArticle() {
        return true;
    }

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public List<String> getRemovableElements() {
        final List<String> result = super.getRemovableElements();
        result.addAll(Arrays.asList( //
                "meta[name*='']", //
                "meta[property*='']", //
                "link", //
                "script", //
                "style", //
                "figure", //
                ".id-DonaldBreadcrumb", //
                ".id-Recommendation", //
                ".id-StoryElement-inArticleReco", //
                "#id-Comments"
        ));
        return result;
    }
}