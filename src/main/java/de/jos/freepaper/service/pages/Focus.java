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
public class Focus extends SupportedPage {

    @Override
    public String getName() {
        return "focus.de";
    }

    @Override
    public boolean removeAllLinks() {
        return true;
    }
    
    @Override
    public Charset getCharset() {
        return StandardCharsets.ISO_8859_1;
    }

    @Override
    public String getPrintURL(String url) {
        return url + "?drucken=1";
    }

    @Override
    public List<String> getRemovableElements() {
        return Arrays.asList( //
          "meta[name*='']", //
          "meta[property*='']", //
          "meta[http-equiv*='']", //
          "link[rel*='']", //
          "script", //
          "noscript", //
          "style", //
          "img", //
          "svg", //
          "form", //
          "a[title='Werbung']", //
          "iframe", //
          "#header-navigation", //
          ".mediaBlock", //
          ".print_header", //
          ".textFazit", //
          ".authorList", //
          ".instagram-media", //
          ".noads", //
          ".textPDF", //
          "#footer"
        );
    }

}
