package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

public class MorgenpostTest extends AbstractPageTest {


    private final SupportedPage page = new Morgenpost();

    private static final String URL = "https://www.morgenpost.de/bezirke/mitte/article410004248/venus-berlin-egon-kowalski-und-die-zigarette-danach.html";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}