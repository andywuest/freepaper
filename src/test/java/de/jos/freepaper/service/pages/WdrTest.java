package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class WdrTest extends AbstractPageTest {

    private final SupportedPage page = new Wdr();

    private static final String URL = "https://www1.wdr.de/nachrichten/-windows95-duesseldorf-landwirt-eiersortiermaschine-100.html";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
