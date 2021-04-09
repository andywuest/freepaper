package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class FourInvestorsTest extends AbstractPageTest {

    private final SupportedPage page = new FourInvestors();

    private static final String URL = "https://www.4investors.de/nachrichten/boerse.php?sektion=stock&ID=131520";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
