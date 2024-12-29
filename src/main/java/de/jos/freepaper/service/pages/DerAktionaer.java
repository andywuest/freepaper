package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.Arrays;
import java.util.List;

public class DerAktionaer extends SupportedPage {

    @Override
    public boolean supportsArticle() {
        return true;
    }

    @Override
    public String getName() {
        return "deraktionaer.de";
    }

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public boolean removeEmptyTags() {
        return true;
    }

    @Override
    public List<String> getRemovableElements() {
        final List<String> result = super.getRemovableElements();
        result.addAll(Arrays.asList( //
                "meta[name*='']", //
                "link[rel*='']", //
                "meta[property*='']", //
                ".breaking-news-container", //
                ".article-header-image", //
                ".related-articles", //
                ".article-chart", //
                ".article-disclaimer", //
                ".table-scrollx-container", //
                ".article-list-latest-issue", //
                "#article-header-info", //
                "#article-detail-keywords", //
                "#article-detail-symbol", //
                "#article-detail-further", //
                "#flyin-banner", //
                "#similar-product", //
                "header", //
                "footer" //
        ));
        return result;
    }

}
