package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

public class TOnlineTest extends AbstractPageTest {

    private final SupportedPage page = new TOnline();

    private static final String URL = "";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}