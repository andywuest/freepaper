package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.Arrays;
import java.util.List;

public class HeiseMeinung extends SupportedPage {

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
                "a-collapse", //
                "a-analytics", //
                "a-script", //
                "a-ad", //
                "img", //
                "svg", //
                "figure", //
                "noscript" //
        ));
        return result;
    }

}
