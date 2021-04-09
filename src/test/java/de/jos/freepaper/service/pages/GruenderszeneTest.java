package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class GruenderszeneTest extends AbstractPageTest {

    final SupportedPage page = new Gruenderszene();

    private static final String URL = "https://www.gruenderszene.de/fintech/n26-axel-seitz-phishing";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
