
package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class TheGuardianTest extends AbstractPageTest {

    final SupportedPage page = new TheGuardian();

    private static final String URL = "https://www.theguardian.com/film/2019/apr/11/geoffrey-rush-defamation-case-actor-millions-news-corp-nationwide";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
