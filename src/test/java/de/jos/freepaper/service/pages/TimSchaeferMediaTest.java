package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;


public class TimSchaeferMediaTest extends AbstractPageTest {

    private final SupportedPage page = new TimSchaeferMedia();

    private static final String URL = "https://timschaefermedia.com/wenn-vermieter-gastronomen-und-youtube-stars-pleite-gehen-ein-kleingewerbe-zu-haben-ist-gar-nicht-so-leicht/";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
