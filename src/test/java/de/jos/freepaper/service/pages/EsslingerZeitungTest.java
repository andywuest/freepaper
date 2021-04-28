package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import junit.framework.TestCase;
import org.junit.Test;

public class EsslingerZeitungTest extends AbstractPageTest {

    private final SupportedPage page = new EsslingerZeitung();

    private static final String URL = "https://www.esslinger-zeitung.de/inhalt.tierpark-nymphaea-uhus-im-tierpark-geraten-in-umzugsstress.99e781cc-cf58-4431-be17-39fe58072325.html";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
