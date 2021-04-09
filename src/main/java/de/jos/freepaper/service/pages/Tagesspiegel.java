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
public class Tagesspiegel extends SupportedPage {

    @Override
    public String getName() {
        return "tagesspiegel.de";
    }

    @Override
    public Charset getCharset() {
        return StandardCharsets.ISO_8859_1;
    }

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public List<String> getRemovableElements() {
        return Arrays.asList( //
          "meta[content*='']", //
          "meta[property*='']", //
          "link[rel*='']", //
          "link[href*='']", //
          "script", //
          "figure", //
          "iframe", //
          "#hcf-ad-wrapper", //
          "#ivw", //
          "#urban-sky-right", //
          ".ts-header", //
          ".ts-footer", //
          ".ts-right", //
          ".ts-homepage-link", //
          ".ts-most-read", //
          ".ts-most-discussed", //
          ".ts-secondary-supplements", //
          ".ts-authors-contact", //
          ".ts-topic-related", //
          ".disclaimer", //
          "#kommentare", //
          "#multislot-urban-sponsored-links", //
          ".ts-actionbar-wrapper"
        );
    }

}
