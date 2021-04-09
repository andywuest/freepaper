package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class JetztTest extends AbstractPageTest {

    String URL = "http://www.jetzt.de/flugbegleiter/ortstermin-beim-lufthansa-casting";

    @Test
    public void getDownload() {
        final SupportedPage page = new Jetzt();
        performDownload(page, URL);
    }

}
