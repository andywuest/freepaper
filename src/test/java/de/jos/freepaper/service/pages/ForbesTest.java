package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

public class ForbesTest extends AbstractPageTest {

    private final SupportedPage page = new Forbes();

    @Test
    public void getDownload() {
        final String url = "https://www.forbes.com/sites/zakdoffman/2019/06/13/huawei-testing-russias-aurora-os-as-complete-android-replacement-report-claims/?sh=744fb0ae6875";
        performDownload(page, url);
    }
}