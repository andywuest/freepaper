package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class QuotenmeterTest extends AbstractPageTest {

    private final SupportedPage page = new Quotenmeter();

    private final String URL = "https://www.quotenmeter.de/cms/?p1=n&p2=118035&p3=&qry=&mobile=off";

    @Test
    public void getPrintURL() {
        final String printURL = page.getPrintURL(URL);
        assertThat(printURL).isEqualTo("https://www.quotenmeter.de/cms/print.php?id=118035");
    }

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}