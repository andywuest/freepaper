package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

import static org.junit.Assert.*;

public class AxiosTest extends AbstractPageTest {

    private final SupportedPage page = new Axios();

    private static final String URL = "https://www.axios.com/ubisoft-assassins-creed-great-resignation-aef86e61-75a8-4446-8ad6-f2c58bd0b730.html";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}