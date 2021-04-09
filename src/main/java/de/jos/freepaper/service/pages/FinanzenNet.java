package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author wuesand
 */
public class FinanzenNet extends SupportedPage {

    @Override
    public String getName() {
        return "finanzen.net";
    }

    @Override
    public String getPrintURL(String url) {
        return url + "@print";
    }

    @Override
    public List<String> getRemovableElements() {
        return Arrays.asList( //
                "meta[name*='']", //
//                "meta[property*='']", //
                "link[rel*='']", //
                "script",//
                "noscript",//
                "img", //
                "#tmpIVWPixelDivBox", //
                ".teaser-img", //
                ".overscroll-container", //
                ".fvNewsHeader" //
        );
    }

}
