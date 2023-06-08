package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

public class SWRTest extends AbstractPageTest {

    private static final String URL = "https://www.swr.de/swraktuell/baden-wuerttemberg/stuttgart/schwabenlandtower-steht-wieder-vor-verkauf-100.html";

    final SupportedPage page = new SWR();

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}