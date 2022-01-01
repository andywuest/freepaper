package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import junit.framework.TestCase;
import org.junit.Test;

public class EsslingerZeitungTest extends AbstractPageTest {

    private final SupportedPage page = new EsslingerZeitung();

    private static final String URL = "https://www.esslinger-zeitung.de/inhalt.ice-strecke-nach-ulm-tempolimit-auf-der-neuen-ice-strecke.b1beaeb8-01ff-477c-ad38-23feef272a7f.html";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
