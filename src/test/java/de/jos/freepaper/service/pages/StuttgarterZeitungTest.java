package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class StuttgarterZeitungTest extends AbstractPageTest {

    final SupportedPage page = new StuttgarterZeitung();

    private static final String URL = "https://www.stuttgarter-zeitung.de/inhalt.antiflirting-stuttgarterin-veroeffentlicht-uebergriffige-chatverlaeufe.0249422e-ced1-460a-a653-4b463db9290e.html";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
