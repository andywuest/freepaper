package de.jos.freepaper.service.pages;

import java.util.Arrays;
import java.util.List;

public class HeiseMeinung extends AbstractHeise {

    @Override
    public String getPrintURL(String url) {
        return url + "?view=print";
    }

    @Override
    public String getName() {
        return "heise.de/meinung";
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
                "style", //
                "meta", //
                "script", //
                "embetty-tweet", //
                "img", //
                "svg", //
                "figure", //
                "noscript" //
        ));
        return result;
    }

}
