package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

public class DeutschlandfunkTest extends AbstractPageTest {

    private final SupportedPage page = new Deutschlandfunk();

    private static final String URL = "https://www.deutschlandfunk.de/marquis-de-sade-ein-gegner-der-tugend-100.html";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}