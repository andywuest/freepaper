package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

/**
 * @author awuest
 */
public class BentoTest extends AbstractPageTest {

    private final SupportedPage page = new Bento();

    private static final String URL = "http://www.bento.de/gefuehle/nebenjob-prostituierte-warum-meine-eltern-nichts-wissen-889484/";

    @Test
    public void getPrintUrl_shouldReturnPrintUrl() {
        final String printUrl = page.getPrintURL(URL);
        final String expectedUrl = URL;

        assertThat(printUrl).isEqualTo(expectedUrl);
    }

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
