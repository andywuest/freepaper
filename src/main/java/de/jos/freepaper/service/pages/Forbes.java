package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.Arrays;
import java.util.List;

public class Forbes extends SupportedPage {

    @Override
    public String getName() {
        return "forbes.com";
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
        return Arrays.asList( //
                "link[rel*='']", //
                "style", //
                "svg", //
                "script", //
                "header", //
                "noscript", //
                "fbs-cordial", //
                "fbs-carousel", //
                "fbs-ad", //
                ".bottom-contrib-block", //
                ".elderly-label", //
                ".article-footer", //
                ".article-body-image", //
                ".article-sharing" //
        );
    }

}
