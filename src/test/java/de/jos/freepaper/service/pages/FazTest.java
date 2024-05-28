package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class FazTest extends AbstractPageTest  {
    
    private static final String URL = "https://www.faz.net/aktuell/karriere-hochschule/anti-colonial-days-an-uni-frankfurt-geplant-19747696.html";

    final SupportedPage page = new Faz();

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }    
    
}
