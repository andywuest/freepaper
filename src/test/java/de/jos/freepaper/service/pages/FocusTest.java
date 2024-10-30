package de.jos.freepaper.service.pages;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author awuest
 */
public class FocusTest extends AbstractPageTest {

//    @Test
//    public void getPrintUrl_shouldReturnPrintUrl() {
//        final Focus page = new Focus();
//        final String printUrl = page.getPrintURL("http://www.focus.de/finanzen/recht/betrugs-prozess-richter-verzweifeln-an-s-k_id_5979755.html");
//        final String expectedUrl = "http://www.focus.de/finanzen/recht/betrugs-prozess-richter-verzweifeln-an-s-k_id_5979755.html?drucken=1";
//
//        assertThat(printUrl).isEqualTo(expectedUrl);
//    }

    @Test
    public void getDownload() {
        final Focus page = new Focus();
        final String url = "https://www.focus.de/gesundheit/ernaehrung/luftfilter-abgedeckte-schuessel-folie-reporter-testet-frischhalte-tricks-fuer-obst-und-gemuese-ergebnisse-ueberraschen_id_260437593.html";
        performDownload(page, url);
    }

}
