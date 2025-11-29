package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

import static org.junit.Assert.*;

public class AugsburgerAllgemeineTest extends AbstractPageTest {

    private final SupportedPage page = new AugsburgerAllgemeine();

    private static final String URL = "https://www.augsburger-allgemeine.de/kultur/gesellschaft/Interview-Saengerin-Ina-Mueller-Ich-turne-bis-zur-Urne-id58572971.html";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}