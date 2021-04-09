package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author awuest
 */
public class Jetzt extends SupportedPage {

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public String getName() {
        return "jetzt.de";
    }

    @Override
    public boolean supportsArticle() {
        return true;
    }

    @Override
    public List<String> getRemovableElements() {
        return Arrays.asList( //
                "meta[name*='']", //
                "meta[property*='']", //
                "meta[http-equiv*='']", //
                "link[rel*='']", //
                "script", //
                "style", //
                "img", //
                "noscript", //
                "#document-header", //
                ".breadcrumb-list", //
                "footer", //
                ".postload-container", //
                ".szlabel", //
                ".apos-slideshow-items", //
                ".teaser__widget", //
                ".apos-modal-login", //
                ".sharingbar" //
        );
    }

}
