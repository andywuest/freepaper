package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

public class NTVTest extends AbstractPageTest {

    private final SupportedPage page = new NTV();

    private static final String URL = "https://www.n-tv.de/leute/Zieh-dir-was-an-Oma--article22339927.html";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}

