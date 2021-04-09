package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author awuest
 */
public class BoerseOnline extends SupportedPage {

    @Override
    public String getName() {
        return "boerse-online.de";
    }

    @Override
    public String getPrintURL(String url) {
        final String suffix = url.replaceAll(".*-online.de", "");
        String printUrl = url.replaceAll("/nachrichten/aktien/", "/nachrichten/drucken/");
        printUrl = printUrl + "?url=" + suffix;
        return printUrl;
    }

    @Override
    public Charset getCharset() {
        return StandardCharsets.ISO_8859_1;
    }

    @Override
    public List<String> getRemovableElements() {
        return Arrays.asList( //
          "meta[name*='']", //
          "meta[property*='']", //
          "meta[http-equiv*='']", //
          "link[rel*='']", //
          "script", //
          "img" //
        );
    }

}
