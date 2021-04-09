package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author awuest
 */
public class Chip extends SupportedPage {

    @Override
    public String getName() {
        return "chip.de";
    }

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public List<String> getRemovableElements() {
        return Arrays.asList( //
                "meta[name*='']", //
                "meta[property*='']", //
                "meta[itemType*='']", //
                "meta[content*='']", //
                "meta[http-equiv*='']", //
                "link[rel*='']", //
                "style", //
                "video", //
                "aside", //
                "nav", //
                "button", //
                "figure", //
                "script", //
                "header", //
                "footer", //
                "svg", //
                "img", //
                ".List.is-separated" //
        );
    }

}
