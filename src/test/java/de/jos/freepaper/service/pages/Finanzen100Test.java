package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 * @author awuest
 */
public class Finanzen100Test extends AbstractPageTest {

    private final SupportedPage page = new Finanzen100();

    private static final String URL = "https://www.finanzen100.de/finanznachrichten/wirtschaft/us-finanzprofi-ist-ueberzeugt-bei-gold-und-goldaktien-hat-sich-ein-perfekter-sturm-gebildet_H1356286877_342006/";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
