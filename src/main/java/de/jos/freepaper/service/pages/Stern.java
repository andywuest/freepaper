package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.Arrays;
import java.util.List;

/**
 * @author awuest
 */
public class Stern extends SupportedPage {

    @Override
    public String getName() {
        return "stern.de";
    }

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public List<String> getRemovableElements() {
        final List<String> elements = super.getRemovableElements();

        elements.addAll(Arrays.asList( //
                "meta[name*='']", //
                "meta[property*='']", //
                "meta[itemprop*='']", //
                "link[rel*='']", //
                "header", //
                "style", //
                "x-drawer", //
                "footer", //
                "nav", //
                "iframe", //
                "script", //
                "noscript", //
                "figure", //
                "time", //
                "x-gallery-scroller", //
                ".breadcrumb", //
                ".group__embedded-teasers", //
                ".article__end", //
                ".article__sidebar", //
                ".article__tags", //
                ".teaser__headline-wrapper", //
                ".article__text-element--blockquote", //
                ".group-teaserblock__item", //
                ".group-teaser-image-gallery", //
                "img" //
        ));

        return elements;
    }

}
