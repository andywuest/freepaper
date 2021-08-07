package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

public class DwTest extends AbstractPageTest {

    private final SupportedPage page = new Dw();

    private static final String URL = "https://www.dw.com/de/abdala-kubas-neuer-wunder-impfstoff/a-58037486";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
