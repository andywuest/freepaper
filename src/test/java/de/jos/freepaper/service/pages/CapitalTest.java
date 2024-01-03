package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

public class CapitalTest extends AbstractPageTest {

    private static final String URL = "https://www.capital.de/wirtschaft-politik/-zu-langsam--zu-traege--zu-kompliziert---ist-vw-so-ueberlebensfaehig--34259704.html";

    final SupportedPage page = new Capital();

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}