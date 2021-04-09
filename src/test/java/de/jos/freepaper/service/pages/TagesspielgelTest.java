package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class TagesspielgelTest extends AbstractPageTest {

    private final SupportedPage page = new Tagesspiegel();

    private static final String URL = "http://www.tagesspiegel.de/berlin/gastbeitrag-zur-berliner-spd-von-der-volkspartei-zur-staatspartei/14602668.html";

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
