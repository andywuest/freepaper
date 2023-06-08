package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

public class MozTest extends AbstractPageTest {

    private static final String URL = "";

    final SupportedPage page = new Moz();

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
