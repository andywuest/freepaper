package de.jos.freepaper.service.pages;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class FocusTest extends AbstractPageTest {

    @Test
    public void getPrintUrl_shouldReturnPrintUrl() {
        final Focus page = new Focus();
        final String printUrl = page.getPrintURL("http://www.focus.de/finanzen/recht/betrugs-prozess-richter-verzweifeln-an-s-k_id_5979755.html");
        final String expectedUrl = "http://www.focus.de/finanzen/recht/betrugs-prozess-richter-verzweifeln-an-s-k_id_5979755.html?drucken=1";

        assertThat(printUrl).isEqualTo(expectedUrl);
    }

    @Test
    public void getDownload() {
        final Focus page = new Focus();
        final String url = "http://www.focus.de/finanzen/recht/betrugs-prozess-richter-verzweifeln-an-s-k_id_5979755.html";
        performDownload(page, url);
    }

}
