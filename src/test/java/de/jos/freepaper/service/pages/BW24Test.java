package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

public class BW24Test extends AbstractPageTest {

    private static final String URL = "https://www.bw24.de/auto/ig-metall-chef-warnt-wegen-verlagerung-der-produktion-ins-ausland-zr-92237556.html";

    final SupportedPage page = new BW24();

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}