package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author wuesand
 */
public class RollingStoneTest extends AbstractPageTest {

    private final SupportedPage page = new RollingStone();

    final String URL = "https://www.rollingstone.com/movies/reviews/where-is-kyra-movie-review-michelle-pfeiffer-w518646";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
