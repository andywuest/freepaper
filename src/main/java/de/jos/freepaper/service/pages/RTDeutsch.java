package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author awuest
 */
public class RTDeutsch extends SupportedPage {

    @Override
    public String getName() {
        return "deutsch.rt.com";
    }

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public List<String> getRemovableElements() {
        return Arrays.asList(
          "meta[content*='']", //
          "meta[name*='']", //
          "meta[property*='']", //
          "link", //
          "script", //
          "noscript", // 
          "iframe", //
          "form", //
          "svg", //
          ".trends__heading", //
          ".subscribe__info-text", //
          ".subscribe__info-title", //
          ".header__content", //
          ".header__langs", //
          ".article__share", //
          ".article__read-more", // 
          "article__tags", //
          ".article__category-heading", //
          ".rows__column_section-right", //
          ".cookies__banner-text", //
          ".layout__header", //
          ".rtcode", //
          ".layout__footer", //
          ".article__cover", //
          ".article__tags", //
          "#taboola-below-article-thumbnails", //
          "#taboola-below-article-thumbnails-2nd", //
          "#hypercomments_widget", //
          ".hc-link"
        );
    }

}
