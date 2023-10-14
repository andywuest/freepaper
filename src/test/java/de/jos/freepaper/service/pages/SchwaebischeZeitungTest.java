package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

public class SchwaebischeZeitungTest extends AbstractPageTest {

    private final SupportedPage page = new SchwaebischeZeitung();

    private static final String URL = "https://www.schwaebische.de/regional/allgaeu/isny/isnyer-kultband-feiert-jubilaeum-1965119";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}

