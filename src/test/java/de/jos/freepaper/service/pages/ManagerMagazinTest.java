package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class ManagerMagazinTest extends AbstractPageTest {

    String URL = "http://www.manager-magazin.de/unternehmen/autoindustrie/norwegen-investoren-bauen-fabrik-fuer-wunder-diesel-a-1156215.html";
    String PRINT_URL = "http://www.manager-magazin.de/unternehmen/autoindustrie/norwegen-investoren-bauen-fabrik-fuer-wunder-diesel-a-1156215-druck.html";

    private final SupportedPage page = new ManagerMagazin();
    
    @Test
    public void getPrintUrl_shouldReturnPrintUrl() {
        final String printUrl = page.getPrintURL(URL);
        final String expectedUrl = PRINT_URL;

        assertThat(printUrl).isEqualTo(expectedUrl);
    }

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
