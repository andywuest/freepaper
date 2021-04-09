package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author awuest
 */
public class ManagerMagazin extends SupportedPage {

    @Override
    public String getName() {
        return "manager-magazin.de";
    }

    @Override
    public String getPrintURL(String url) {
        return url.replaceAll(".html", "-druck.html");
    }

    @Override
    public List<String> getRemovableElements() {
        return Arrays.asList( //
          "meta[name*='']", //
          "link[rel*='']", //
          "script", //
          "iframe", //
          "#mmSZM", //
          ".print-logo", //
          ".print-head", //
          ".article-copyright", //
          "#parsely-root" //
        );
    }

}
