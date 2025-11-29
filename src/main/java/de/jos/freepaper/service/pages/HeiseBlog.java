package de.jos.freepaper.service.pages;

import java.util.Arrays;
import java.util.List;

public class HeiseBlog extends AbstractHeise {

    @Override
    public String getPrintURL(String url) {
        return url + "?view=print";
    }

    @Override
    public String getName() {
        return "heise.de/blog";
    }

    @Override
    public List<String> getRemovableElements() {
        final List<String> result = super.getRemovableElements();
        result.addAll(Arrays.asList( //
                "meta[name*='']", //
                "meta[http-equiv*='']", //
                "meta[property*='']", //
                "link[rel*='']", //
                "style", //
                "footer", //
                "embetty-tweet" //
        ));
        return result;
    }

}
