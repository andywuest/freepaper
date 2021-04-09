package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class FazTest extends AbstractPageTest  {
    
    private static final String URL = "https://www.faz.net/aktuell/finanzen/ist-das-geld-sicher-lieber-sparkasse-als-smartphone-bank-n26-16150622.html";

    final SupportedPage page = new Faz();

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }    
    
}
