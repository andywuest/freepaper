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
    public boolean supportsArticle() {
        return true;
    }

    @Override
    public List<String> getRemovableElements() {
        return Arrays.asList( //
          "meta[name*='']", //
          "meta[property*='']", //
          "link[href*='']", //
          "script", //
          "noscript", //
          "nav", //
          "picture", //
          "iframe", //
          ".teaser-absatz", //
          ".absatzbild", //
          ".authorline" //
        );
    }
    
}
