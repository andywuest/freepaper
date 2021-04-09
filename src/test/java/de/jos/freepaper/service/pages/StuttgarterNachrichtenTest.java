package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class StuttgarterNachrichtenTest extends AbstractPageTest {
    
    final SupportedPage page = new StuttgarterNachrichten();

    private static final String URL = "http://www.stuttgarter-nachrichten.de/inhalt.kreis-rastatt-ausgebuextes-kaenguru-wieder-eingefangen.8290f2ff-0741-47c0-bd7d-d56be6c5dea6.html";

    @Test
    public void getPrintUrl_shouldReturnPrintUrl() {
        final String printUrl = page.getPrintURL(URL);
        final String expectedUrl = "http://www.stuttgarter-nachrichten.de/inhalt.print.8290f2ff-0741-47c0-bd7d-d56be6c5dea6.presentation.print.v2.html";

        assertThat(printUrl).isEqualTo(expectedUrl);
    }

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }    
    
}
