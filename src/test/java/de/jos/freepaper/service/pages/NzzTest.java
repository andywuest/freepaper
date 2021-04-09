package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class NzzTest extends AbstractPageTest {

    private final SupportedPage page = new Nzz();

    private static final String URL = "https://www.nzz.ch/international/das-internet-bekommt-eine-neue-generation-nutzer-ld.1506888?mktcid=smsh&mktcval=OS%20Share%20Hub";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
