package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class HeiseHintergrundTest extends AbstractPageTest {

    final SupportedPage page = new HeiseHintergrund();

    private static final String URL = "https://www.heise.de/hintergrund/Studie-Windparks-in-der-Nordsee-nehmen-sich-gegenseitig-den-Wind-weg-6066394.html";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }
}
