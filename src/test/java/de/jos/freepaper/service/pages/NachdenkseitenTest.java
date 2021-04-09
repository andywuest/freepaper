package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

public class NachdenkseitenTest extends AbstractPageTest {

    private final SupportedPage page = new Nachdenkseiten();

    private static final String URL = "https://www.nachdenkseiten.de/wp-print.php?p=64933";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
