package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

public class NDRTest extends AbstractPageTest {

    private final SupportedPage page = new NDR();

    private static final String URL = "https://www.ndr.de/nachrichten/schleswig-holstein/Pflegekammer-SH-Knapp-92-Prozent-der-Mitglieder-wollen-Aufloesung,pflegeberufekammer116.html";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
