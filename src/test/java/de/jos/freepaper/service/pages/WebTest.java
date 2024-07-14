package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

public class WebTest extends AbstractPageTest {

    private final SupportedPage page = new Web();

    private static final String URL = "https://web.de/magazine/unterhaltung/stars/sharon-stone-verlor-schlaganfall-18-millionen-dollar-39870580";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
