package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

public class BusinessInsiderTest extends AbstractPageTest {

    private final SupportedPage page = new BusinessInsider();

    private static final String URL = "https://www.businessinsider.de/wirtschaft/sohn-von-winterkorn-entwickelt-batterie-volkswagen-h/";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}