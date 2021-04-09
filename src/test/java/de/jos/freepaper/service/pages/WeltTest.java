package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class WeltTest extends AbstractPageTest {

    private final SupportedPage page = new Welt();

    private static final String URL = "https://www.welt.de/politik/deutschland/article192753835/DGB-Chef-bei-1-Mai-Kundgebung-Das-sind-die-Totengraeber-eines-weltoffenen-Europas.html";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
