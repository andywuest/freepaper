package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author awuest
 */
public class Techcrunch extends SupportedPage {

    @Override
    public String getName() {
        return "techcrunch.com";
    }

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public List<String> getRemovableElements() {
        final List<String> removableElements = super.getRemovableElements();
        removableElements.addAll(Arrays.asList(
                "link[rel*='']",
                "meta[property*='']", //
                "meta[name*='']", //
                "header",
                "footer",
                "nav",
                ".article-sidebar",
                ".article-hero__category",
                ".article-hero__share",
                ".wp-block-tc23-post-relevant-terms",
                ".wp-block-techcrunch-social-share",
                ".wp-block-techcrunch-seamless-scroll",
                ".wp-block-techcrunch-post-authors",
                ".tc23-post-relevant-terms__terms",
                ".seamless-scroll__loader"
        ));
        return removableElements;
    }

}
