package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

public class MorgenpostTest extends AbstractPageTest {


    private final SupportedPage page = new Morgenpost();

    private static final String URL = "https://www.morgenpost.de/kultur/tv/article230684138/Sommerhaus-der-Stars-Regisseur-wirft-RTL-Fehlschnitte-vor.html";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}