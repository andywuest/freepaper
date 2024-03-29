package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class MMnewsTest extends AbstractPageTest {

    private final SupportedPage page = new MMNews();

    private static final String URL = "https://www.mmnews.de/index.php/wirtschaft/209812-iw-verbandsumfrage-miserable-lage-duesterer-ausblick";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
