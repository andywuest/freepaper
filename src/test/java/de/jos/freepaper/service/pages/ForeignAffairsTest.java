package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

public class ForeignAffairsTest extends AbstractPageTest {

    private final SupportedPage page = new ForeignAffairs();

    @Test
    public void getDownload() {
        final String url = "https://www.foreignaffairs.com/ukraine/russia-rebound-moscow-recovered-military-setbacks";
        performDownload(page, url);
    }

}