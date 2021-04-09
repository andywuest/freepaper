package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class HeiseCtTest extends AbstractPageTest {

    final SupportedPage page = new HeiseCt();

    private static final String URL = "https://www.heise.de/ct/artikel/Das-wird-die-Wiedergeburt-von-Firefox-3806138.html";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
