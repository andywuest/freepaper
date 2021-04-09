package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class SternTest extends AbstractPageTest {

    final SupportedPage page = new Stern();

    private static final String URL = "https://www.stern.de/kultur/tv/-sommerhaus-der-stars---warum-man-lisha-keine-plattform-geben-sollte-9457830.html";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

    
    
}

