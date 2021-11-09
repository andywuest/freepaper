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
public class Wirtschaftswoche extends SupportedPage {

    @Override
    public Charset getCharset() {
        return StandardCharsets.ISO_8859_1;
    }

    @Override
    public String getPrintURL(final String givenUrl) {
        final String url = givenUrl.replaceAll(".html", "-all.html");
        return url;
    }

    @Override
    public String getName() {
        return "www.wiwo.de";
    }

    @Override
    public boolean supportsArticle() {
        return true;
    }

    @Override
    public boolean removeAllLinks() {
        return true;
    }

    @Override
    public List<String> getRemovableElements() {
        return Arrays.asList(//
                "meta[content*='']", //
                "img", //
                "link", //
                "picture", //
                "svg", //
                "video", //
                "style", //
                "script", //
                "iframe", //
                "input", //
                ".c-socialblock", //
                ".c-socials__icon", //
                ".c-socials__text", //
                ".u-desktop-hidden", //
                ".u-mobile-hidden", //
                ".js-headline", //
                ".c-metadata", //
                ".u-listdot-artikelbox", //
                ".c-teaser--type-article", //
                ".c-icon--doctype-imagegallery", //
                ".c-advertisment__fullWidth", //
                ".o-article__content-element--articlelbox", //
                ".c-gallery__item-title" //
        );
    }

}
