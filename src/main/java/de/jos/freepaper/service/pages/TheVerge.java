package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author awuest
 */
public class TheVerge extends SupportedPage {

    @Override
    public String getName() {
        return "theverge.com";
    }

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public boolean removeEmptyTags() {
        return true;
    }

    @Override
    public List<String> getRemovableElements() {
        // contains virtually no usable ids and classes :-(
        final List<String> result = super.getRemovableElements();
        result.addAll(Arrays.asList( //
                "meta[name*='']", //
                "meta[property*='']", //
                "meta[http-equiv*='']", //
                "link[rel*='']", //
                "style", //
                "svg", //
                "nav", //
                "button", //
                "header", //
                "footer", //
                "noscript", //
                "script", //
                "figure", //
                "form", //
                "#rock-good-deals", //
                ".c-comments__message", //
                ".c-nav-list__main" //
        ));
        return result;
    }

}
