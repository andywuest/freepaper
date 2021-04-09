package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class VenturebeatTest extends AbstractPageTest {

    final SupportedPage page = new Venturebeat();

    private static final String URL = "https://venturebeat.com/2019/04/06/google-and-other-tech-giants-are-quietly-buying-up-the-most-important-part-of-the-internet/";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
