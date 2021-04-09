package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class TazTest extends AbstractPageTest {

    private final SupportedPage page = new Taz();

    private static final String URL = "https://taz.de/Polizeiarbeit-in-Stuttgart/!5702594/";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
