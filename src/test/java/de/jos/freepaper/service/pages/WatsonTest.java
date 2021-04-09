package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

public class WatsonTest extends AbstractPageTest {


    private static final String URL = "https://www.watson.de/leben/interview/394788742-prostitution-wer-nicht-mit-freiern-schlafen-will-will-nicht-mit-menschen-schlafen";

    private final SupportedPage page = new Watson();

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }


}