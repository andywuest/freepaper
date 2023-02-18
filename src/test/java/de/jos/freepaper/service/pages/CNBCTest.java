package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

public class CNBCTest extends AbstractPageTest {

    private final SupportedPage page = new CNBC();

    private static final String URL = "https://www.cnbc.com/2023/02/15/critical-chip-firm-asml-says-former-china-employee-misappropriated-data.html";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
