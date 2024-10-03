package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

public class TomsHardwareTest extends AbstractPageTest {

    private final SupportedPage page = new TomsHardware();

    private static final String URL = "https://www.tomshardware.com/tech-industry/semiconductors/the-worlds-semiconductor-industry-hinges-on-a-quartz-factory-in-north-carolina";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}