package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author awuest
 */
public class Rbb24 extends SupportedPage {

    @Override
    public String getName() {
        return "www.rbb24.de";
    }

    @Override
    public String getPrintURL(String url) {
        return url + "/listall=on/print=true.html";
    }

    @Override
    public List<String> getRemovableElements() {
        return Arrays.asList(
                "meta[content*='']", //
                "meta[name*='']", //
                "meta[link*='']", //
                "meta[property*='']", //
                "meta[http-equiv*='']", //
                "link[rel*='']", //
                "script", //
                "header", //
                "footer", //
                "iframe", //
                "section", //
                ".epg_props", //
                ".newSharing_func", //
                ".scrollcontent", //
                "figure" //
        );
    }

}
