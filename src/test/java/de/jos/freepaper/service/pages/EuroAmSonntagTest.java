package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

import static org.junit.Assert.*;

public class EuroAmSonntagTest extends AbstractPageTest {

    private final SupportedPage page = new EuroAmSonntag();

    private static final String URL = "https://www.eurams.de/nachrichten/aktien/analyst-raet-commerzbank-aktien-jetzt-verkaufen-20384496.html?feed=Fp6x9RbRcEGNP_Diir28TQ";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}