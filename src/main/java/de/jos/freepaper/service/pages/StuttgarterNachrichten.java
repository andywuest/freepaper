package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author awuest
 */
public class StuttgarterNachrichten extends SupportedPage {

    @Override
    public String getPrintURL(String url) {
        return url;
    }


    @Override
    public boolean supportsArticle() {
        return true;
    }

    @Override
    public String getName() {
        return "stuttgarter-nachrichten.de";
    }

    @Override
    public List<String> getRemovableElements() {
        final List<String> result = super.getRemovableElements();
        result.addAll(Arrays.asList( //
          "meta[name*='']", //
          "meta[property*='']", //
          "meta[http-equiv*='']", //
          "link[rel*='']", //
          "figure", //
          "style", //
          "nav", //
          "header", //
          "footer", //
          "noscript", //
          "#service_themen", //
          "#article-social-bar", //
          ".articleTeaser", //
          ".article-image", //
          ".mod-sidebar", //
          "script" //
        ));
        return result;
    }

}
