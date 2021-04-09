package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class Rbb24Test extends AbstractPageTest {

    private final SupportedPage page = new Rbb24();

    final String URL = "https://www.rbb24.de/politik/beitrag/2019/10/abgase-dieselskandal-nox-messung-kraftfahrtbundesamt-autos-schmutzig.html";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
