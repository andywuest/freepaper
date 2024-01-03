package de.jos.freepaper.service.pages;

import java.util.Arrays;
import java.util.List;

/**
 * @author wuesand
 */
public class HeiseTelepolis extends AbstractHeise {

    @Override
    public String getPrintURL(String url) {
        return url + "?view=print";
    }

    @Override
    public String getName() {
        return "heise.de/tp";
    }

    @Override
    public List<String> getRemovableElements() {
        final List<String> result = super.getRemovableElements();
        result.addAll(Arrays.asList( //
                "meta[name*='']", //
                "meta[property*='']", //
                "meta[http-equiv*='']", //
                "link[rel*='']", //
                "nav", //
                ".heisetopnavi", //
                "embetty-tweet", //
                ".printversion__back-to-article", //
                "#navi_bottom", //
                "style", //
                "img", //
                "footer", //
                "svg", //
                "script", //
                "noscript", //
                "figure" //
        ));
        return result;
    }

}
