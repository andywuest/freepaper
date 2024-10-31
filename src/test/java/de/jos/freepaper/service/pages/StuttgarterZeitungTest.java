package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class StuttgarterZeitungTest extends AbstractPageTest {

    final SupportedPage page = new StuttgarterZeitung();

    private static final String URL = "https://www.stuttgarter-zeitung.de/inhalt.kultkneipe-im-stuttgarter-westen-aera-endet-heute-im-hotzenplotz-neue-paechter-wollen-nichts-veraendern.f6dcc69a-8908-459c-aca8-befb89143002.html";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
