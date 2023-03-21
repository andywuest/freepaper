package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

public class BlickTest extends AbstractPageTest {

    private final SupportedPage page = new Blick();

    private static final String URL = "https://www.blick.ch/ausland/schauspieler-ist-putins-kumpel-steven-seagal-soll-russischen-soldaten-aikido-beibringen-id18420605.html";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
