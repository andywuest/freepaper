package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

import static org.junit.Assert.*;

public class DerAktionaerTest extends AbstractPageTest {

    private static final String URL = "https://www.deraktionaer.de/artikel/aktien/volkswagen-nicht-zu-stoppen-wie-viel-potenzial-steckt-noch-in-der-aktie-des-automobil-herstellers-20227618.html?feed=TRtvHrugxEKV2n-qR2P-ag";

    final SupportedPage page = new DerAktionaer();

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}