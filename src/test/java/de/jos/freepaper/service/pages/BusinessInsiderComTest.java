package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

public class BusinessInsiderComTest extends AbstractPageTest {

    private final SupportedPage page = new BusinessInsiderCom();

    private static final String URL = "https://www.businessinsider.com/tech-broken-promises-streaming-ride-hailing-cloud-computing-2023-8";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
