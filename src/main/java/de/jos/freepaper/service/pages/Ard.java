package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author awuest
 */
public class Ard extends SupportedPage {

    @Override
    public String getName() {
        return "bento.de";
    }

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public List<String> getRemovableElements() {
        return Arrays.asList( //
          "meta[property*='']", //
          "meta[http-equiv*='']", //
          "meta[name*='']", //
          "link[href*='']", //          
          "script", //
          "noscript", //
          "iframe", //
          "header", //
          "footer", //
          "img", //
          "h4", //
          ".category", //
          ".image-source", //
          ".headerline", //
          ".slideshow", //
          ".article-link-box", //
          ".quote", //
          ".hashtags", //
          ".slide_element", //
          ".infobox", //
          ".social-icons", //
          ".article-preview-gradient", //
          ".ad" //
        );
    }

}
