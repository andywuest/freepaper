package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class WirtschaftswocheTest extends AbstractPageTest {

    private final SupportedPage page = new Wirtschaftswoche();

    private static final String URL = "https://www.wiwo.de/beruehmter-kaseya-hack-tausende-cyber-attacken-ermittler-nehmen-mehrere-verdaechtige-fest/27781028.html";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }    
    
}
