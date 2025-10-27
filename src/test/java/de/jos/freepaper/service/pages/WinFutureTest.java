package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

public class WinFutureTest extends AbstractPageTest {

    private final SupportedPage page = new WinFuture();

    private static final String URL = "https://winfuture.de/news,154413.html";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }
}
