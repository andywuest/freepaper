package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

public class PCGamesHardwareTest extends AbstractPageTest {

    private final SupportedPage page = new PCGamesHardware();

    private static final String URL = "https://www.pcgameshardware.de/Command-und-Conquer-Generals-Zero-Hour-Spiel-75176/News/Native-Linux-Version-1470065/";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
