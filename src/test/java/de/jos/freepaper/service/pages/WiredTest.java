package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

import static org.junit.Assert.*;

public class WiredTest extends AbstractPageTest {

    private final SupportedPage page = new Wired();

    private static final String URL = "https://www.wired.com/story/jolla-phone-2026/";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }
}