package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.Arrays;
import java.util.List;

public class Moz extends SupportedPage {

    @Override
    public String getName() {
        return "moz.de";
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
                "link[rel*='']", //
                "style", //
                "script", //
                "noscript", //
                "svg", //
                "figure", //
                "picture", //
                "#youtube_1_", //
                "#youtube_2_", //
                "#youtube_3_", //
                "#social_network_twitter_1_", //
                "#social_network_twitter_2_", //
                "#social_network_twitter_3_", //
                ".teaser", //
                ".teaser-article-detail", //
                ".teaser-container" //
        ));
        return result;
    }


}

