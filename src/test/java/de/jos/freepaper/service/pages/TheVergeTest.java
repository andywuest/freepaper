package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class TheVergeTest extends AbstractPageTest {

    private final SupportedPage page = new TheVerge();

    private static final String URL = "https://www.theverge.com/2019/5/19/18631558/google-huawei-android-suspension";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
