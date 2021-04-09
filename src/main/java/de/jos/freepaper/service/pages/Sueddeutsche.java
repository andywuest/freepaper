package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author awuest
 */
public class Sueddeutsche extends SupportedPage {

    @Override
    public String getPrintURL(String url) {
        return url + "?print=true";
    }

    @Override
    public String getName() {
        return "www.sueddeutsche.de";
    }

    @Override
    public List<String> getRemovableElements() {
        return Arrays.asList(//
          "meta[http-equiv*='']", //
          "meta[name*='']", //
          "link[rel*='']", //
          "script", //
          "header", //
          "style", //
          "svg", //
          "dl" //
        );
    }

    @Override
    public boolean removeAllLinks() {
        return true;
    }
    
}
