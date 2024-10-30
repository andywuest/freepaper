package de.jos.freepaper.service.pages;

import org.junit.Test;

/**
 * @author awuest
 */
public class FocusTest extends AbstractPageTest {

    @Test
    public void getDownload() {
        final Focus page = new Focus();
        final String url = "https://www.focus.de/gesundheit/ernaehrung/luftfilter-abgedeckte-schuessel-folie-reporter-testet-frischhalte-tricks-fuer-obst-und-gemuese-ergebnisse-ueberraschen_id_260437593.html";
        performDownload(page, url);
    }

}
