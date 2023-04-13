package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

public class YahooEntertainmentTest extends AbstractPageTest {

    private final SupportedPage page = new YahooEntertainment();

    private static final String URL = "https://www.yahoo.com/entertainment/queen-hearts-director-made-feminist-235629944.html?guce_referrer=aHR0cHM6Ly93d3cuZ29vZ2xlLmNvbS8&guce_referrer_sig=AQAAABwPHK37izZ3H4rX5tPTAuy4UXRgqG29IOke7Bffc1CZinAjei126JyBq337pE_d1V3J3fBKlSIKb4DYf005tDfahEAmXyulM-RNyJt1mB6SJ5UBzUMgwwMy_pkds0n68gCruL27BtJ-gWJTmjD2i0xsyarDmpeZVATNcr6uQ4-S&guccounter=2";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
