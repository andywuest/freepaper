package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

public class Report24Test extends AbstractPageTest {

    private final SupportedPage page = new Report24();

    final String URL = "https://report24.news/die-dunklen-seiten-des-rki-leaks-multipolar-nicht-eingeweiht-escort-girl-als-aufdeckerin/";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}

