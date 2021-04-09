package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author awuest
 */
public class DerStandard extends SupportedPage {

    @Override
    public String getName() {
        return "derstandard.at";
    }

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public List<String> getRemovableElements() {
        return Arrays.asList( //
          "meta[name*='']", //
          "meta[property*='']", //
          "link[href*='']", //
          "script", //
          "noscript", //
          "#pagetop", //
          ".socialsharing", //
          ".photo", //
          ".video", //
          ".supplemental", //
          "#pageTop", //
          "#toolbar", //
          "#breadcrumb", //
          "#navigation", //
          "#media-list", //
          "#articleTools", //
          "#footer", //
          "#privacypolicy" //
        );
    }
    
}
