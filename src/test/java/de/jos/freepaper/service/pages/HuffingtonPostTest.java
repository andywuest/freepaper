package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class HuffingtonPostTest extends AbstractPageTest {

    final SupportedPage page = new HuffingtonPost();

    private static final String URL = "http://www.huffingtonpost.de/alina-papke/integration-keine-zukunft-fuer-diese-kinder_b_12523808.html";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
