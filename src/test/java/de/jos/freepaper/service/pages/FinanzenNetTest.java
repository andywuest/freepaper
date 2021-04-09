package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author wuesand
 */
public class FinanzenNetTest extends AbstractPageTest {

    private final SupportedPage page = new FinanzenNet();

    private static final String URL = "https://www.finanzen.net/nachricht/aktien/euro-am-sonntag-aktien-tipp-ich-kaufe-jetzt-barrick-gold-corporation-5949694";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
