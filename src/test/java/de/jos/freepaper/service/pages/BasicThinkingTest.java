package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

public class BasicThinkingTest extends AbstractPageTest {

    private final SupportedPage page = new BasicThinking();

    private static final String URL = "https://www.basicthinking.de/blog/2025/04/09/digitalsteuer-deutschland-trump/";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
