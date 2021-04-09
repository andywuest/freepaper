package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author wuesand
 */
public class HeiseTelepolisTest extends AbstractPageTest {

    final SupportedPage page = new HeiseTelepolis();

    private static final String URL = "https://www.heise.de/tp/features/CDU-CSU-SPD-und-FDP-einigen-sich-auf-Diaetenerhoehung-3916382.html";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
