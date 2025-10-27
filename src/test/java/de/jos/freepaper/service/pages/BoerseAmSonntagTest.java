package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

public class BoerseAmSonntagTest extends AbstractPageTest {

    private final SupportedPage page = new BoerseAmSonntag();

    private static final String URL = "https://www.boerse-am-sonntag.de/aktien/aktien/nestle-neue-nahrung-fuer-das-comeback";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
