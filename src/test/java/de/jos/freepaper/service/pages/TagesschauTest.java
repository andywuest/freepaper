package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 * @author awuest
 */
public class TagesschauTest extends AbstractPageTest {

    private static final String URL = "https://www.tagesschau.de/inland/innenpolitik/fcas-kampfflugzeug-100.html";

    final SupportedPage page = new Tagesschau();

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
