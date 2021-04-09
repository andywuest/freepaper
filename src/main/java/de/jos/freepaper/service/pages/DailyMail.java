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
          "link[rel*='']", //
          "link[id*='']", //
          "script", //
          "noscript", //
          "iframe", //
          "style", //
          "video", //
          ".ssds_ad", //
          "#lightbox-target", //
          "#lightbox-container", //
          "#banner", //
          "#reader-comments", //
          "#share-pictures", //
          "#overlay", //
          "#external-source-links", //
          "#inread-player", //
          "#infinite-list", //
          ".page-header", //
          ".google-sky", //
          ".floating-buttons", //
          ".billboard_wrapper", //
          ".column-content", //
          ".related-carousel", //
          ".imageCaption", //
          "#articleIconLinksContainer", //
          "#most-watched-videos-wrapper", //
          "#most-read-news-wrapper", //
          "#mobileGalleryModal", //
          ".beta", //
          ".page-footer", //
          ".and-footer", //
          "#footer", //
          ".external-source-links" //
        );
    }

}
