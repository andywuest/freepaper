package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class RPOnlineTest extends AbstractPageTest {

    private final SupportedPage page = new RPOnline();

    private static final String URL = "https://rp-online.de/panorama/coronavirus/kurzarbeit-hubertus-heil-will-corona-hilfe-bis-maerz-2022-verlaengern_aid-52915569";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
