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
        return Arrays.asList( //
                "link", //
                "meta[name*='']", //
                "meta[property*='']", //
                "script", //
                "noscript", //
                "blockquote", //
                "img", //
                "table", //
                "footer", //
                "header", //
                "#similar-product", //
                "#share-container", //
                "#article-detail-keywords", //
                "#article-detail-symbol", //
                "#article-detail-further", //
                ".article-image", //
                ".article-chart", //
                "#werte-title", //
                ".related-articles" //
        );
    }


}
