package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class TechcrunchTest extends AbstractPageTest {

    private final SupportedPage page = new Techcrunch();

    private static final String URL = "https://techcrunch.com/2019/03/09/the-other-smartphone-business/?guccounter=1&guce_referrer_us=aHR0cHM6Ly90LmNvL2FKT1VDOTVZR1A&guce_referrer_cs=IPwgCmUga5ehTshj8IilpA";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
