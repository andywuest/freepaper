package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author awuest
 */
public class BoerseOnline extends SupportedPage {

    @Override
    public String getName() {
        return "boerse-online.de";
    }

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public Charset getCharset() {
        return StandardCharsets.ISO_8859_1;
    }

    @Override
    public List<String> getRemovableElements() {
        final List<String> removableElements = super.getRemovableElements();
        removableElements.addAll(Arrays.asList(
                "link[rel*='']",
                "meta[property*='']", //
                "meta[name*='']", //
                ".stock-info-badge-position", //
                ".article-info", //
                ".article-chart", //
                ".article-footer", //
                ".article-related", //
                ".symbol-information", //
                "#header-navigation-account", //
                "#header-search-results", //
                "#breaking-news", //
                "#flyin-banner", //
                "footer", //
                "nav" //
        ));
        return removableElements;
    }

}
