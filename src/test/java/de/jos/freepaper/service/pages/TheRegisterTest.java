package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class TheRegisterTest extends AbstractPageTest {

    private final SupportedPage page = new TheRegister();

    private static final String URL = "https://www.theregister.co.uk/2019/03/08/thales_topseries_vuln/";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
