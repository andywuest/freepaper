package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class HeiseIxTest extends AbstractPageTest {

    final SupportedPage page = new HeiseIx();

    private static final String URL = "https://www.heise.de/ix/meldung/Internet-Security-Days-Sind-wirklich-immer-die-Russen-Schuld-3812949.html";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
