package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

public class TheSunTest extends AbstractPageTest {

    private final SupportedPage page = new TheSun();

    private static final String URL = "";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}


