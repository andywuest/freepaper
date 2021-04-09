package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

/**
 *
 * @author wuesand
 */
public class ProLinuxTest extends AbstractPageTest {

    private static final String URL = "http://www.pro-linux.de/news/1/25911/offizielle-unterst%C3%BCtzung-f%C3%BCr-debian-gnulinux-8-jessie-endet.html";
    private static final String PRINT_URL = "http://www.pro-linux.de/news/1/print/25911/offizielle-unterstuetzung-fuer-debian-gnulinux-8-jessie-endet.html";

    private final SupportedPage page = new ProLinux();

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
