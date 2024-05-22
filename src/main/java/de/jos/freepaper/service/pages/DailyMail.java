package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author awuest
 */
public class DailyMail extends SupportedPage {

    @Override
    public String getName() {
        return "dailymail.co.uk";
    }

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public List<String> getRemovableElements() {
        return Arrays.asList( //
          "meta[name*='']", //
          "meta[property*='']", //
          "meta[content*='']", //
          "link[rel*='']", //
          "link[id*='']", //
          "script", //
          "noscript", //
          "iframe", //
          "style", //
          "form", //
          "video", //
          ".page-header", //
          ".mol-img", //
          ".mol-factbox", //
          ".mol-embed", //
          ".shareArticles", //
          ".billboard-container", //
          ".beta", //
          ".has-button-share", //
          ".page-footer", //
          ".and-footer", //
          ".linkButtonRow", //
          "#mini-carousel-wrapper", //
          "#articleIconLinksContainer", //
          "#most-watched-videos-lazy-container", //
          "#reader-comments", //
          "#sky-left-container", //
          "#sky-right-container", //
          "#footer", //
          "#lightbox-container", //
          "ad-slot" //
        );
    }

}
