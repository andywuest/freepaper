package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.Arrays;
import java.util.List;

public class Axios extends SupportedPage {

    @Override
    public String getName() {
        return "axios.com";
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
        List<String> removableElements = super.getRemovableElements();
        removableElements.addAll(Arrays.asList(
                "script",
                "link",
                "style",
                "svg",
                "amp-img",
                "amp-layout",
                "amp-social-share",
                "figcaption"
        ));
        return removableElements;
    }

}