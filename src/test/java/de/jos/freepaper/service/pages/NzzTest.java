package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class NzzTest extends AbstractPageTest {

    private final SupportedPage page = new Nzz();

    private static final String URL = "https://www.nzz.ch/international/der-konflikt-zwischen-der-tuerkei-und-kurdischen-milizen-heizt-sich-auf-ld.1774692";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
