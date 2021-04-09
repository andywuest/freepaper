package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author wuesand
 */
public class ViceTest extends AbstractPageTest {

    private static final String URL = "";

    private final SupportedPage page = new Vice();

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }
    
}
