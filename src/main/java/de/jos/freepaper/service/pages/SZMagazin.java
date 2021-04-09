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
public class SZMagazin extends SupportedPage {

    @Override
    public Charset getCharset() {
        return StandardCharsets.UTF_8;
    }

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public String getName() {
        return "sz-magazin.sueddeutsche.de";
    }

    @Override
    public List<String> getRemovableElements() {
        return Arrays.asList(//
                "link[rel*='']", //
                "meta[name*='']", //
                "meta[property*='']", //
                "script", //
                "style", //
                "img", //
                "svg", //
                ".socialsharingbar", //
                ".articleheader__metabar", //
                ".articlefooter", //
                "figure"
        );
    }

    @Override
    public boolean supportsArticle() {
        return true;
    }

}
