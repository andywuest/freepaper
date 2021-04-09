package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class HeiseSecurityTest extends AbstractPageTest {
    
    final SupportedPage page = new HeiseSecurity();

    private static final String URL = "https://www.heise.de/security/meldung/FinFisher-Internetprovider-schieben-Spitzelopfern-Malware-unter-3837645.html";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }    
    
}
