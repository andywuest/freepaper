package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

public class BerlinerZeitungTest extends AbstractPageTest {

    private final SupportedPage page = new BerlinerZeitung();

    private static final String URL = "https://www.berliner-zeitung.de/mensch-metropole/bandenkrieg-zwischen-tschetschenen-und-arabischen-clans-eskaliert-li.117557";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}

