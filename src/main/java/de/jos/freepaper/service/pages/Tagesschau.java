package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author awuest
 */
public class Tagesschau extends SupportedPage {

    @Override
    public String getName() {
        return "tagesschau.de";
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
          "iframe", //
          "#header", //
          ".skiplinks", //
          ".socialMedia", //
          ".teaserImTeaser", //
          ".teaser", //
          ".linklist", //
          ".poweruser", //
          ".hidden", //
          ".mediaInfo", //
          ".mediaCon", //
          ".inline", //
          ".ressort", //
          ".infokasten", //
          ".metablockwrapper", //
          "#printbox", //
          "#footer" //
        );
    }
    
}
