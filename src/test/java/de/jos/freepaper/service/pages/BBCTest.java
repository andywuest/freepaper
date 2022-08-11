package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class BBCTest extends AbstractPageTest {

    private final SupportedPage page = new BBC();

    private static final String URL = "https://www.bbc.com/future/article/20220705-the-sustainable-cities-made-from-mud";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
