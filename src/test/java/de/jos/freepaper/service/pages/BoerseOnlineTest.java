package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 * @author awuest
 */
public class BoerseOnlineTest extends AbstractPageTest {

    private final SupportedPage page = new BoerseOnline();

    private static final String URL = "https://www.boerse-online.de/nachrichten/aktien/rwe-aktie-vor-mega-comeback-warum-jetzt-bewegung-in-die-aktie-kommt-20377320.html";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
