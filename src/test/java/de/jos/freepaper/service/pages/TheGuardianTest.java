
package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class TheGuardianTest extends AbstractPageTest {

    final SupportedPage page = new TheGuardian();

    private static final String URL = "https://www.theguardian.com/news/2021/jul/19/edward-snowden-calls-spyware-trade-ban-pegasus-revelations";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
