package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class HeiseTest extends AbstractPageTest {

    final SupportedPage page = new Heise();

    private static final String URL = "https://www.heise.de/news/Fall-Amad-A-Riesenprobleme-mit-NRW-Polizei-Software-4786037.html";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
