package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author awuest
 */
public class MMNews extends SupportedPage {

    @Override
    public String getName() {
        return "mmnews.de";
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
        final List<String> result = super.getRemovableElements();
        result.addAll(Arrays.asList( //
          "meta[name*='']", //
          "meta[property*='']", //
          "base[href*='']", //
          "link[href*='']", //
          "style", //
          ".a2a_kit", //
          ".sp-right", //
          ".sp-left", //
          "script", //
          ".article-footer-wrap", //
          ".article-info-wrapper", //
          "#yes-invest-inhalte", //
          ".jwDisqusForm", //
          "#taboola-below-article-thumbnails",
          "ins", //
          "img", //
          "ul" //
        ));
        return result;
    }

}
