package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

/**
 *
 * @author awuest
 */
public class ChipTest extends AbstractPageTest {

    private final SupportedPage page = new Chip();

    private static final String URL = "https://www.chip.de/news/Nach-Rauswurf-bei-Edeka-Ketchup-Gigant-bekommt-neuen-Aerger_164990142.html";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
