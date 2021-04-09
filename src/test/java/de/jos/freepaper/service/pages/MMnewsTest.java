package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class MMnewsTest extends AbstractPageTest {

    private final SupportedPage page = new MMNews();

    private static final String URL = "http://www.mmnews.de/politik/28421-die-fachkraefte-luege";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
