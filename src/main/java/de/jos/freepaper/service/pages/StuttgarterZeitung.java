package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author awuest
 */
public class StuttgarterZeitung extends SupportedPage {

    @Override
    public String getName() {
        return "stuttgarter-zeitung.de";
    }

    @Override
    public List<String> getRemovableElements() {
        return Arrays.asList( //
                "meta[name*='']", //
                "meta[content*='']", //
                "meta[property*='']", //
                "meta[http-equiv*='']", //
                "link[rel*='']", //
                "script", //
                "style", //
                "aside", //
                "noscript", //
                "figure", //
                "iframe", //
                "dig-plugin", //
                "img", //
                "nav", //
                "header", //
                "footer", //
                "button", //
                ".adv", //
                ".container-stz-popup", //
                "#elastic-recommendation",
                "#traffectiveCustomCSS",
                "#article-share-content",
                "div[style='display:none']",
                ".box-author", //
                ".imod-teaser-fullwidth", //
                ".printHeader" //
        );
    }

    @Override
    public String getPrintURL(String url) {
        return url;
    }

}
