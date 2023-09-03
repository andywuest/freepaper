package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

/**
 * @author awuest
 */
public class Dwdl extends SupportedPage {

    @Override
    public Charset getCharset() {
        return StandardCharsets.UTF_8;
    }

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public String getName() {
        return "dwdl.de";
    }

    @Override
    public List<String> getRemovableElements() {
        final List<String> result = super.getRemovableElements();
        result.addAll(Arrays.asList( //
                "meta[name*='']", //
                "meta[property*='']", //
                ".navigation-wrapper", //
                ".social", //
                ".hide-on-print", //
                ".newsticker-wrapper", //
                ".sendetermin", //
                ".external-content", //
                ".author-box", //
                "link[rel*='']", //
                "script", //
                "noscript", //
                "figure", //
                "footer", //
                "img" //
        ));
        return result;
    }

}
