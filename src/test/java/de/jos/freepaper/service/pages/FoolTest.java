package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

public class FoolTest extends AbstractPageTest {

    private final SupportedPage page = new Fool();

    @Test
    public void getDownload() {
        final String url = "https://www.fool.com/investing/2026/04/13/nvidia-just-made-a-2-billion-game-changing-move/";
        performDownload(page, url);
    }
}