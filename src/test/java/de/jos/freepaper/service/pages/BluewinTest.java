package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

public class BluewinTest extends AbstractPageTest {

    private final SupportedPage page = new Bluewin();

    private static final String URL = "https://www.bluewin.ch/de/leben/lifestyle/sie-musste-akzeptieren-dass-sie-an-zweiter-stelle-kommt-1910101.html";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}