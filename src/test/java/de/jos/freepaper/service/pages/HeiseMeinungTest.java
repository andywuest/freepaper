package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

public class HeiseMeinungTest extends AbstractPageTest {

    final SupportedPage page = new HeiseMeinung();

    private static final String URL = "https://www.heise.de/meinung/Alle-reden-von-Clustern-nur-die-Corona-App-nicht-4951026.html";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}