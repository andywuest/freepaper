package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

public class GamesIndustryTest extends AbstractPageTest {

    final SupportedPage page = new GamesIndustry();

    private static final String URL = "https://www.gamesindustry.biz/masters-of-albion-is-peter-molyneuxs-final-shot-at-redemption-probably";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}