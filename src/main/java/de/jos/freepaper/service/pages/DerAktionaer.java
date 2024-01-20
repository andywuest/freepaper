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
    public List<String> getRemovableElements() {
        final List<String> result = super.getRemovableElements();
        result.addAll(Arrays.asList( //
                "link", //
                "meta[name*='']", //
                "meta[property*='']", //
                "script", //
                "noscript", //
                "blockquote", //
                "img", //
                "small", //
                "table", //
                "footer", //
                "#share-article-nav", //
                "#similar-product", //
                "#share-container", //
                "#article-detail-keywords", //
                "#article-detail-symbol", //
                "#article-detail-further", //
                ".stock-info-badge", //
                ".article-image", //
                ".article-chart", //
                "#werte-title", //
                "#article-detail-keywords", //
                ".article-video", //
                ".article-header-image", //
                ".article-disclaimer", //
                ".related-articles" //
        ));
        return result;
    }

}
