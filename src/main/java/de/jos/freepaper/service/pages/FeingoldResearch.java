package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author awuest
 */
public class FeingoldResearch extends SupportedPage {

    @Override
    public String getName() {
        return "feingold-research.com";
    }

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public List<String> getRemovableElements() {
        return Arrays.asList( //
          "link[rel*='']", //
          "link[id*='']", //
          "meta[name*='']", //
          "script", //
          "style", //
          "img", //
          "em", //
          "strong", //
          "#info_text_header", //
          ".title_container", //
          "#header", //
          ".sidebar", //
          ".comment-entry", //
          ".post_nav_container", //
          ".blog-inner-meta", //
          ".pp_overlay", //
          "#fb-root",
          "#footer", //
          "#socket" //
        );
    }

}
