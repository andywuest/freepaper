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
                "x-drawer", //
                "nav", //
                "iframe", //
                "script", //
                "noscript", //
                ".breadcrumb", //
                ".group__embedded-teasers", //
                ".article__end", //
                ".article__sidebar", //
                ".article__tags", //
                "img" //
        ));

        return elements;
    }

}
