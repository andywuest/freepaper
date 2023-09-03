package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class DwdlTest extends AbstractPageTest {

    private final SupportedPage page = new Dwdl();

    private static final String URL = "https://www.dwdl.de/madeineurope/94034/lust_wo_bleibt_die_sexualitaet_bei_frauen_ueber_40/";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
