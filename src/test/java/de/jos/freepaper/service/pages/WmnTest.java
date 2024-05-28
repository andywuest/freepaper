package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

public class WmnTest extends AbstractPageTest {

    private final SupportedPage page = new Wmn();

    private static final String URL = "";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}

