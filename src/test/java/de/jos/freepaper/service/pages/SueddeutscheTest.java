package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class SueddeutscheTest extends AbstractPageTest {

    private static final String URL = "https://www.sueddeutsche.de/wissen/usa-schlangenkopf-fisch-1.4639921";

    final SupportedPage page = new Sueddeutsche();

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
