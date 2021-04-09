package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class NoizzTest extends AbstractPageTest {

    private final SupportedPage page = new Noizz();

    private static final String URL = "https://noizz.de/entertainment/doku-uber-singles-tindern-in-berlin-ist-konservativ/72tv0d8";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
