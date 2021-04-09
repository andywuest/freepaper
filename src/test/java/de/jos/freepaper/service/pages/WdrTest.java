package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class WdrTest extends AbstractPageTest {

    private final SupportedPage page = new Wdr();

    private static final String URL = "http://www1.wdr.de/nachrichten/landespolitik/westlb-portigon-razzia-100.html";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
