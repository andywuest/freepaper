package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

public class ForbesTest extends AbstractPageTest {

    private final SupportedPage page = new Forbes();

    @Test
    public void getDownload() {
        final String url = "https://www.forbes.com/sites/greatspeculations/2026/04/15/how-oracle-stock-could-rise-to-300/";
        performDownload(page, url);
    }
}