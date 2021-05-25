package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author wuesand
 */
public class HeiseTelepolis extends SupportedPage  {
    
    @Override
    public String getPrintURL(String url) {
        return url + "?view=print";
    }    
    
    @Override
    public String getName() {
        return "heise.de/tp";
    }

    @Override
    public List<String> getRemovableElements() {
        final List<String> result = super.getRemovableElements();
        result.addAll(Arrays.asList( //
          "meta[name*='']", //
          "meta[property*='']", //
          "meta[http-equiv*='']", //
          "link[rel*='']", //
          "nav", //
          "a-analytics", // special tag
          ".heisetopnavi", //
          ".printversion__back-to-article", //
          "#navi_bottom", //
          "style", //
          "img", //
          "svg", //
          "script", //
          "noscript", //
          "figure" //
        ));
        return result;
    }    
    
}
