package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author awuest
 */
public class Zeit extends SupportedPage {

    @Override
    public String getName() {
        return "zeit.de";
    }

    @Override
    public String getPrintURL(String url) {
        return url + "/komplettansicht?print";
    }

    @Override
    public List<String> getRemovableElements() {
        return Arrays.asList(//
          "meta[name*='']", //
          "meta[property*='']", //
          "meta[http-equiv*='']", //
          "link[rel*='']", //
          "figure", //
          "script", //
          "img", //
          "svg  ", //
          "aside", //
          "noscript", //
          "#iqd_mainAd", //
          ".header", //
          ".skiplink", //
          ".stoa", //
          ".article-footer", //
          "#nextread", //
          ".nextread-advertisement", //
          ".article-pagination", //
          ".article-lineage", //
          "#comments", //
          ".footer" //
        );
    }

}
