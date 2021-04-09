package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

public class RepublikTest extends AbstractPageTest {

    private final SupportedPage page = new Republik();

    final String URL = "https://www.republik.ch/2020/03/03/was-stimmt-denn-jetzt";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
