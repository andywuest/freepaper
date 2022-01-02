package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElektroniknetTest extends AbstractPageTest {

    private final SupportedPage page = new Elektroniknet();

    private static final String URL = "https://www.elektroniknet.de/automotive/infotainment/cariad-und-tomtom-arbeiten-gemeinsam-an-naechster-navi-generation.192509.html";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}