package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class HeiseMacAndITest extends AbstractPageTest {
    
    final SupportedPage page = new HeiseMacAndI();

    private static final String URL = "https://www.heise.de/mac-and-i/meldung/Stardesigner-haelt-Apple-im-Smartphone-Sektor-fuer-erledigt-4323749.html";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }    
    
}
