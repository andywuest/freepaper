package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class NetmomsTest extends AbstractPageTest {

    private final SupportedPage page = new Netmoms();

    private static final String URL = "";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
