package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class BoerseOnlineTest extends AbstractPageTest {

    private final SupportedPage page = new BoerseOnline();

    private static final String URL = "http://www.boerse-online.de/nachrichten/aktien/Frankreich-Aufbruch-in-neue-Zeiten-1001645204";

    private static final String URL_PRINT = "http://www.boerse-online.de/nachrichten/drucken/Frankreich-Aufbruch-in-neue-Zeiten-1001645204?url=/nachrichten/aktien/Frankreich-Aufbruch-in-neue-Zeiten-1001645204";

    @Test
    public void getPrintUrl_shouldReturnPrintUrl() {
        final String printUrl = page.getPrintURL(URL);
        final String expectedUrl = URL_PRINT;

        assertThat(printUrl).isEqualTo(expectedUrl);
    }

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
