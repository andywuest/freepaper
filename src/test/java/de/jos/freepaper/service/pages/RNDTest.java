package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

public class RNDTest extends AbstractPageTest {

    private final SupportedPage page = new RND();

    private final static String URL = "";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}