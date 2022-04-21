package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author awuest
 */
public class HeiseTestSection extends SupportedPage {

    @Override
    public String getPrintURL(String url) {
        return url + "?view=print";
    }

    @Override
    public String getName() {
        return "heise.de/test";
    }

    @Override
    public List<String> getRemovableElements() {

        final List<String> result = super.getRemovableElements();
        result.addAll(Arrays.asList( //
          "meta[name*='']", //
          "meta[http-equiv*='']", //
          "meta[property*='']", //
          "meta[name*='']", //
          "link[rel*='']", //
          "nav", //
          ".heisetopnavi", //
          ".printversion--hide", //
          "#navi_bottom", //
          "style", //
          "img", //
          "svg", //
          "a-script", // special tag
          "a-ad", // special tag
          "a-collapse", // special tag
          "a-bilderstrecke", // special tag
          "script", //
          "noscript", //
          "figure" //
        ));
        return result;
    }

}
