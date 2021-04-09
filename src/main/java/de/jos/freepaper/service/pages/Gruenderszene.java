package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author awuest
 */
public class Gruenderszene extends SupportedPage {

    @Override
    public String getName() {
        return "gruenderszene.de";
    }

    @Override
    public List<String> getRemovableElements() {
        final List<String> result = super.getRemovableElements();
        result.addAll(Arrays.asList( //
                "link[rel*='']", //
                "meta[name*='']", //
                "meta[property*='']", //
                "script", //
                "header", //
                "footer", //
                "vm-lazy", //
                "form", //
                "button", //
                "input", //
                "noscript", //
                "style", //
                "nav", //
                "#rotation_box_list", //
                "img" //
        ));
        return result;
    }

    @Override
    public String getPrintURL(String url) {
        return url;
    }

}
