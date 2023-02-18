package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.Arrays;
import java.util.List;

/**
 * @author awuest
 */
public class HeiseIx extends SupportedPage {

    @Override
    public String getPrintURL(String url) {
        return url + "?view=print";
    }

    @Override
    public String getName() {
        return "heise.de/ix";
    }

    @Override
    public List<String> getRemovableElements() {

        final List<String> result = super.getRemovableElements();
        result.addAll(Arrays.asList( //
                "meta[name*='']", //
                "link[rel*='']", //
                "nav", //
                "footer", //
                ".heisetopnavi", //
                "#navi_bottom", //
                "embetty-tweet", //
                "style", //
                "img", //
                "svg", //
                "a-script", // special tag
                "script", //
                "noscript", //
                "figure" //
        ));
        return result;
    }

}
