package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

public class TelepolisTest extends AbstractPageTest {

    private final SupportedPage page = new Telepolis();

    private static final String URL = "https://www.telepolis.de/article/Die-ARD-auf-dem-Drahtseil-11147350.html";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}