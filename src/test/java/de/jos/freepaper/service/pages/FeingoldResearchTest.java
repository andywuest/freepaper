package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class FeingoldResearchTest extends AbstractPageTest {
 
    final SupportedPage page = new FeingoldResearch();

    private static final String URL = "http://www.feingold-research.com/2016/10/tesla-vor-der-pleite/";

    @Test
    public void getPrintUrl_shouldReturnPrintUrl() {
        final String printUrl = page.getPrintURL(URL);
        final String expectedUrl = "http://www.feingold-research.com/2016/10/tesla-vor-der-pleite/";

        assertThat(printUrl).isEqualTo(expectedUrl);
    }

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }    
    
}
