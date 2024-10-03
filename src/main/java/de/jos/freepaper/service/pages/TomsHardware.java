package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.Arrays;
import java.util.List;

public class TomsHardware extends SupportedPage {

    @Override
    public String getName() {
        return "www.tomshardware.com";
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
    public List<String> getRemovableElements() {
        // contains virtually no usable ids and classes :-(
        final List<String> result = super.getRemovableElements();
        result.addAll(Arrays.asList( //
                "meta[name*='']", //
                "meta[property*='']", //
                "meta[http-equiv*='']", //
                "link[rel*='']", //
                "nav", //
                ".slice-container-newsletterForm", //
                ".slice-container-authorBio", //
                ".slice-container-moreAbout", //
                ".article-sponsored-post", //
                ".infinite-container", //
                ".xenforo-comment-widget", //
                ".related-articles-block", //
                ".see-more", //
                "aside", //
                "#articleTag", //
                "footer" //
        ));
        return result;
    }

}
