package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class StuttgarterZeitungTest extends AbstractPageTest {

    final SupportedPage page = new StuttgarterZeitung();

    private static final String URL = "https://www.stuttgarter-zeitung.de/inhalt.nachtleben-am-schlossplatz-stuttgarter-meiden-die-innenstadt.fdbc86d1-5430-4232-8f2d-90fbabd6dc74.html";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
