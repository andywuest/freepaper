package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author wuesand
 */
public class FinanzdivaTest extends AbstractPageTest {

    private final SupportedPage page = new Finanzdiva();

    private static final String URL = "http://finanzdiva.de/sandra-navidi-hoer-auf-dein-bauchgefuehl/";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
