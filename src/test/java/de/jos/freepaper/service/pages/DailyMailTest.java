package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class DailyMailTest extends AbstractPageTest {

    private static final String URL = "";

    private final SupportedPage page = new DailyMail();

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
