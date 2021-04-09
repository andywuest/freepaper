package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class VdiNachrichtenTest extends AbstractPageTest {
    
    private final SupportedPage page = new VdiNachrichten();

    private static final String URL = "https://www.vdi-nachrichten.com/Gesellschaft/Hacker-Arzt";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }
    
}
