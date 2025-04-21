package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class TechcrunchTest extends AbstractPageTest {

    private final SupportedPage page = new Techcrunch();

    private static final String URL = "https://techcrunch.com/2025/03/05/volkswagens-cheapest-ev-ever-is-the-first-to-use-rivian-software/";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
