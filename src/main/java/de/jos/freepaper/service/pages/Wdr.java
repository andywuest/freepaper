package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author awuest
 */
public class Wdr extends SupportedPage {

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public String getName() {
        return "wdr.de";
    }

    @Override
    public List<String> getRemovableElements() {
        return Arrays.asList(//
          "link[rel*='']", //
          "meta[name*='']", //
          "meta[property*='']", //
          "script", //
          "noscript", //
          "style", //
          "iframe", //
          "img", //
          "#header", //
          ".sectionA", //
          ".sectionC", //
          ".hidden", //
          ".teaser", //
          ".socialMedia", //
          "#footer" //

        );
    }
}
