package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

public class DerAktionaerTest extends AbstractPageTest {

    private static final String URL = "https://www.deraktionaer.de/artikel/medien-ittk-technologie/walt-disney-milliardaer-attackiert-fuehrung-live-im-tv-20348056.html";

    final SupportedPage page = new DerAktionaer();

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}