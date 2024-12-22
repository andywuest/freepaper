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
        final List<String> removableElements = super.getRemovableElements();
        removableElements.addAll(
                Arrays.asList(//
                        "meta[http-equiv*='']", //
                        "meta[name*='']", //
                        "meta[property*='']", //
                        "link[rel*='']", //
                        "header", //
                        "footer", //
                        "style", //
                        "dl", //
                        ".articlemain__authors-box", //
                        ".breadcrumbs__content", //
                        ".sz-archive-container", //
                        ".article-further-reading", //
                        ".image-gallery", //
                        ".szm-toolbar", //
                        ".article-ending-nav", //
                        ".inline-teaser" //
                ));
        return removableElements;
    }

    @Override
    public boolean supportsArticle() {
        return true;
    }

}
