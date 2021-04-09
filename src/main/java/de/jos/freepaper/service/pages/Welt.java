package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author awuest
 */
public class Welt extends SupportedPage {

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public String getName() {
        return "www.welt.de";
    }

    @Override
    public List<String> getRemovableElements() {
        return Arrays.asList(//
          "meta[content*='']", //
          "link[rel*='']", //
          "script", //
          "style", //
          "noscript", //
          "header", //
          "video", //
          "svg", //
          "img", //
          "figure", //
          "picture", //
          "#Comments", //
          ".c-channel-header", //
          ".c-inline-element", //
          ".nocontent", //
          ".c-content-slider", //
          ".c-ad", //
          ".c-breadcrumb", //
          ".c-channel-navigation", //
          ".c-social-bar__icon-link", //
          ".c-themepages", //
          "footer" //
          //"style" //
          
        );
    }    
    
}
