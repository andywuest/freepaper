package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

public class ArsTechnicaTest extends AbstractPageTest {

    private final SupportedPage page = new ArsTechnica();

    private static final String URL = "https://arstechnica.com/information-technology/2022/12/never-before-seen-malware-is-nuking-data-in-russias-courts-and-mayors-offices/";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
