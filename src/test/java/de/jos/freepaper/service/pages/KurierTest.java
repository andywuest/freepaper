package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class KurierTest extends AbstractPageTest {

    private final SupportedPage page = new Kurier();

    private static final String URL = "https://kurier.at/wirtschaft/schiedsgerichte-warum-die-usa-niemals-verlieren/222.022.961";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
