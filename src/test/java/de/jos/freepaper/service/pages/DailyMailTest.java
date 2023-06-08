package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class DailyMailTest extends AbstractPageTest {

    private static final String URL = "https://www.dailymail.co.uk/news/article-11826175/Walmart-says-shut-stores-Portland-months-CEO-warned-historic-theft.html";

    private final SupportedPage page = new DailyMail();

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
