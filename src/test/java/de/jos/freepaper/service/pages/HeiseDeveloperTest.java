package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class HeiseDeveloperTest extends AbstractPageTest {

    final SupportedPage page = new HeiseDeveloper();

    private static final String URL = "https://www.heise.de/developer/meldung/Java-SE-Entwicklung-soll-Tempo-aufnehmen-3826414.html";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }
}
