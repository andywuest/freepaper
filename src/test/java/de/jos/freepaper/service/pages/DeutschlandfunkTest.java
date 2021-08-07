package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

public class DeutschlandfunkTest extends AbstractPageTest {

    private final SupportedPage page = new Deutschlandfunk();

    private static final String URL = "https://www.deutschlandfunk.de/prostitution-in-coronazeiten-die-freier-wollen-trotzdem-sex.724.de.html?dram:article_id=494452";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}