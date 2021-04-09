package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class StylebookTest extends AbstractPageTest {

    final SupportedPage page = new Stylebook();

    private static final String URL = "https://www.stylebook.de/love/paartherapeut-ueber-getrennte-betten-in-der-beziehung";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
    


