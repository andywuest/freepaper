package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class WeltTest extends AbstractPageTest {

    private final SupportedPage page = new Welt();

    private static final String URL = "https://www.welt.de/politik/deutschland/article68de29669ab5e8bd613e00e2/nach-hamas-festnahmen-kriminalitaet-kommt-nicht-von-aussen-sondern-ist-ein-produkt-der-gesellschaft-sagt-die-linke.html";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
