package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class TeleboerseTest extends AbstractPageTest {

    private final SupportedPage page = new Teleboerse();

    private static final String URL = "http://www.teleboerse.de/marktberichte/Dax-faellt-zurueck-ins-Minus-article18729396.html";

    @Test
    public void getPrintUrl_shouldReturnPrintUrl() {
        final String printUrl = page.getPrintURL(URL);
        final String expectedUrl = "http://www.teleboerse.de/marktberichte/Dax-faellt-zurueck-ins-Minus-article18729396.html?service=print";

        assertThat(printUrl).isEqualTo(expectedUrl);
    }

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
