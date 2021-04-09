package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class France24Test extends AbstractPageTest {

    final SupportedPage page = new France24();

    private static final String URL = "https://www.france24.com/en/africa/20210330-portugal-to-send-troops-to-mozambique-after-brazen-palma-attack-by-islamic-insurgents";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
