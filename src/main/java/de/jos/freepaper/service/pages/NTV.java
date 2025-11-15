package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.List;

/**
 * @author awuest
 */
public class NTV extends SupportedPage {

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public String getName() {
        return "n-tv.de";
    }

    @Override
    public boolean removeEmptyTags() {
        return true;
    }

    @Override
    public boolean supportsArticle() {
        return true;
    }

    @Override
    public List<String> getRemovableElements() {
        final List<String> removableElements = super.getRemovableElements();
        removableElements.addAll(List.of(
                "meta[content*='']", //,
                "link[rel*='']", //,
                "[class^=article-detail-footer_tags]", //,
                "[class^=social-share_social-share]", //,
                "aside", //,
                "nav", //,
                "header",
                "footer"));
        return removableElements;
    }

}
