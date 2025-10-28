package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

public class GameStarTest extends AbstractPageTest {

    final SupportedPage page = new GameStar();

    private static final String URL = "https://www.gamestar.de/artikel/china-wueste-solarzellen-studie,3428705.html";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}