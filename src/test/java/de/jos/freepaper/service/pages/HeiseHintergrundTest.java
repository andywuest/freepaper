package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class HeiseHintergrundTest extends AbstractPageTest {

    final SupportedPage page = new HeiseHintergrund();

    private static final String URL = "https://www.heise.de/hintergrund/Insekten-sterben-weltweit-4717343.html";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }
}
