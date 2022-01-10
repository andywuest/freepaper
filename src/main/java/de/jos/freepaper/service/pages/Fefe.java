package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

/**
 * @author wuesand
 */
public class Fefe extends SupportedPage {

    @Override
    public String getName() {
        return "fefe.de";
    }

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public boolean removeAllLinks() {
        return true;
    }
}
