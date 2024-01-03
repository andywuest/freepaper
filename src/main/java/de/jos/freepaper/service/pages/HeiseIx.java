package de.jos.freepaper.service.pages;

import java.util.Arrays;
import java.util.List;

/**
 * @author awuest
 */
public class HeiseIx extends AbstractHeise {

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
                "script", //
                "noscript", //
                "figure" //
        ));
        return result;
    }

}
