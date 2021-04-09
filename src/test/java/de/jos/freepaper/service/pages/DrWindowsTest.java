package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class DrWindowsTest extends AbstractPageTest {

    private static final String URL = "https://www.drwindows.de/news/die-vierte-macht-sailfish-os-teil-1-hintergruende-und-ueberblick";

    final SupportedPage page = new DrWindows();

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
