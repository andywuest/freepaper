package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

/**
 *
 * @author awuest
 */
public class DwdlTest extends AbstractPageTest {

    private final SupportedPage page = new Dwdl();

    private static final String URL = "https://www.dwdl.de/meinungen/78799/frank_rosin_ein_routinier_scheitert_mit_seiner_routine/";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
