package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

public class FortuneTest extends AbstractPageTest {

    private final SupportedPage page = new Fortune();

    @Test
    public void getDownload() {
        final String url = "https://fortune.com/2023/12/02/ai-chip-export-controls-china-nvidia-raimondo/";
        performDownload(page, url);
    }

}