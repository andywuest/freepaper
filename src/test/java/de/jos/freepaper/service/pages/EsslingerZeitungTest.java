package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

public class EsslingerZeitungTest extends AbstractPageTest {

    private final SupportedPage page = new EsslingerZeitung();

    private static final String URL = "https://www.esslinger-zeitung.de/inhalt.neujahrsempfang-in-ostfildern-sparzwaenge-ueberschatten-das-stadtjubilaeum.fea73182-2d50-4c8a-9599-380fa6fdd24d.html";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
