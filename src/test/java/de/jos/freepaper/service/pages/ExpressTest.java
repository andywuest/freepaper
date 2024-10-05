package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

public class ExpressTest extends AbstractPageTest {

    private final SupportedPage page = new Express();

    private static final String URL = "";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
