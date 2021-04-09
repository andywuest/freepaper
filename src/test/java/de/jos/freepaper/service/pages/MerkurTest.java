package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

public class MerkurTest extends AbstractPageTest {

    private static final String URL = "https://www.merkur.de/leben/gesundheit/impfung-multiple-sklerose-ms-biontech-tierversuch-studie-menschen-zr-90165056.html";

    private final SupportedPage page = new Merkur();

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}