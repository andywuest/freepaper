package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

public class CapitalTest extends AbstractPageTest {

    private static final String URL = "https://www.capital.de/wirtschaft-politik/pepsi-gegen-coca-cola--der-reiz-des-erzrivalen-37114376.html?utm_medium=standard&utm_source=rss";

    final SupportedPage page = new Capital();

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}