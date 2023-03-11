package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author awuest
 */
public class HeiseSecurity extends SupportedPage {

    @Override
    public String getPrintURL(String url) {
        return url + "?view=print";
    }

    @Override
    public String getName() {
        return "heise.de/security";
    }

    @Override
    public List<String> getRemovableElements() {
        //return Collections.emptyList();
        final List<String> result = super.getRemovableElements();
        result.addAll(Arrays.asList( //
                "meta[name*='']", //
                "meta[property*='']", //
                "link[rel*='']", //
                "style", //
                "svg", //
                "header", //
                "figure", //
                "footer", //
                "script", //
                "embetty-tweet", //
                "a-script", // special tag
                "a-collapse", // special tag
                "a-opt-in", //
                "#navi_bottom", //
                "#mitte_rechts", //
                ".adbottom", //
                "noscript" //
        ));
        return result;
    }

}
