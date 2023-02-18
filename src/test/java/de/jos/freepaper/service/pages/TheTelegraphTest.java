package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

public class TheTelegraphTest extends AbstractPageTest {

    private final SupportedPage page = new TheTelegraph();

    private static final String URL = "https://www.telegraph.co.uk/world-news/2023/01/06/elite-swiss-ski-resort-flies-snow-slopes-mild-winter/";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}