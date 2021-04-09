package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author wuesand
 */
public class MeediaTest extends AbstractPageTest {

    private static final String URL = "https://meedia.de/2018/09/11/stroeer-tochter-betreibt-unserioese-klickfaengerei-auf-facebook-und-huellt-sich-dazu-in-schweigen/";

    private final SupportedPage page = new Meedia();

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }
    
}
