package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

public class HeiseTestTest extends AbstractPageTest {

    final SupportedPage page = new HeiseTestSection();

    private static final String URL = "https://www.heise.de/tests/Mercedes-Benz-EQS-im-Test-Das-leiseste-Elektroauto-der-Welt-6140000.html";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
