package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author awuest
 */
public class HeiseCt extends SupportedPage {

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public String getName() {
        return "heise.de/ct";
    }

    @Override
    public List<String> getRemovableElements() {
        //return Collections.emptyList();
        final List<String> result = super.getRemovableElements();
        result.addAll(Arrays.asList( //
          "meta[name*='']", //
          "meta[property*='']", //
          "link[rel*='']", //
          "footer", //
          "script", //
          "noscript", //
          "figure", //
          "img", //
          "svg", //
          ".ad-container", //
          ".text-muted", //
          ".article_page_img", //
          ".article_page_info", //
          ".header_tags", //
          ".breadcrumb", //
          ".adbottom", //
          ".us_ad", //
          ".teaser_adliste", //
          ".facetten_name", //
          ".bcadv", //
          ".facetten_content", //
          "#sprung_nach_oben", //
          "#navi_bottom" //
          ));
        return result;
    }

}
