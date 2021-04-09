package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author awuest
 */
public class Finanzen100 extends SupportedPage {

    @Override
    public String getName() {
        return "finanzen100.de";
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
          "link[rel*='']", //
          "script",//
          "noscript",//
          "svg", //
          "header", //
          "footer", //
          "figure", //
          "div[id^=banner]", // id start with banner for div tags
          ".article-detail__meta", //
          ".card__header", //
          ".social-sharing", //
          ".special", //
          ".chart", //
          ".grid__item--sidebar", //
          ".premium-teaser-wide", //
          ".grid__item grid__item--main", //
          ".snippet--loading", //
          ".newsletter-subscribe", //
          ".mdl-js-ripple-effect", //
          ".link", //
          ".breadcrumbs", //    
          ".instrument-list", //    
          ".article-teaser", //    
          ".mdl-layout__drawer", //
          ".mdl-layout__drawer-button", //
          ".mdl-navigation" //
        );
    }

}
