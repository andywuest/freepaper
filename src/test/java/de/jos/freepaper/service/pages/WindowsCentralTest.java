package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

import static org.junit.Assert.*;

public class WindowsCentralTest extends AbstractPageTest {

    private final SupportedPage page = new WindowsCentral();

    private static final String URL = "https://www.windowscentral.com/gaming/pc-gaming/in-an-embarrassment-for-microsoft-steamos-seems-to-destroy-windows-11-on-gaming-performance-and-battery-life-as-well-as-usability";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
