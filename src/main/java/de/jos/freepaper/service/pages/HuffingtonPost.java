package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author awuest
 */
public class HuffingtonPost extends SupportedPage {
    
    @Override
    public String getName() {
        return "www.huffingtonpost.de";
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
          "link[href*='']", //
          "script", //
          "noscript", //
          "style", //
          "iframe", //
          "menu", //
          "footer", //
          "center", // seem to contain ads
          "blockquote", //
          ".header", //
          ".author", //
          ".blog-banner", //
          ".headline", //
          ".print_btn", //
          ".ad_spot", //
          ".byline", //
          ".main-visual", //
          "#carousel", //
          "#view_mobile_banner", //
          ".rail", //
          ".video_box_title", //
          ".verticals", //
          ".stories", //
          ".opinary-widget-wrapper", //
          ".bottom-tags", //
          "#floaterTarget", //
          "#tfm_skyscraper", //
          ".footer" //
        );
    }    
    
}
