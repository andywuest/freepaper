package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class SternTest extends AbstractPageTest {

    final SupportedPage page = new Stern();

    private static final String URL = "https://www.stern.de/kultur/film/sydney-sweeney--onlyfans-models-entsetzt-ueber-szenen-in--euphoria--37387488.html";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

    
    
}

