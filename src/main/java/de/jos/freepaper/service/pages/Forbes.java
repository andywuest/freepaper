package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

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
        removableElements.addAll(List.of( //
                "link[rel*='']", //
                "header", //
                "#article-ai-audio", //
                "fbs-cordial", //
                "fbs-carousel", //
                "fbs-ad", //
                ".socialShareContainer", //
                ".recirc-module", //
                ".bottom-contrib-block", //
                ".elderly-label", //
                ".article-footer", //
                ".article-body-image", //
                ".article-sharing" //
        ));
        return removableElements;
    }

}
