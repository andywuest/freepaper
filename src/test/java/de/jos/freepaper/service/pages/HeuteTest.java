package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

public class HeuteTest extends AbstractPageTest {

    String URL = "https://www.heute.at/s/nobelprostituierte-enthuellt-sex-details-der-maechtigen-100249595";

    @Test
    public void getDownload() {
        final SupportedPage page = new Heute();
        performDownload(page, URL);
    }

}
