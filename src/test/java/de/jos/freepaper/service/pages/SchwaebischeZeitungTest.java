package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

public class SchwaebischeZeitungTest extends AbstractPageTest {

    private final SupportedPage page = new SchwaebischeZeitung();

    private static final String URL = "https://www.schwaebische.de/kultur/kabarettistin-schwarzmann-will-zuschauer-mit-positiver-energie-aufladen-1778394";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}

