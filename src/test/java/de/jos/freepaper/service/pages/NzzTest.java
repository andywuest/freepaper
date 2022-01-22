package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class NzzTest extends AbstractPageTest {

    private final SupportedPage page = new Nzz();

    private static final String URL = "https://www.nzz.ch/feuilleton/mattias-tesfaye-die-juedischen-schulen-aber-auch-die-gemeinden-sind-in-einem-masse-mit-antisemitismus-konfrontiert-das-es-frueher-nicht-gab-und-das-ist-wegen-der-migration-ld.1665481";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
