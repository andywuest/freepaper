package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

public class AnnabelleTest extends AbstractPageTest {

    private final SupportedPage page = new Annabelle();

    private static final String URL = "";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}