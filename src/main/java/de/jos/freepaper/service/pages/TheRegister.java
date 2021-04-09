package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author awuest
 */
public class TheRegister extends SupportedPage {

    @Override
    public String getName() {
        return "theregister.co.uk";
    }

    @Override
    public String getPrintURL(String url) {
        return url;
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
                "nav", //
                "form", //
                "img", //
                "ul", //
                "ol", //
                "h5", //
                ".sub_nav", //
                "noscript", //
                "script" //
        ));
        return result;
    }

}
