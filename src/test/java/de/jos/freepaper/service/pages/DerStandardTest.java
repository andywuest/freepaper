package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class DerStandardTest extends AbstractPageTest {

    private static final String URL = "https://www.derstandard.at/story/2000048648166/meine-filme-schneide-ich-am-kuechentisch";

    final SupportedPage page = new DerStandard();

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
