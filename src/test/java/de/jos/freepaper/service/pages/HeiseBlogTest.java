package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

import static org.junit.Assert.*;

public class HeiseBlogTest extends AbstractPageTest {

    final SupportedPage page = new HeiseBlog();

    private static final String URL = "https://www.heise.de/blog/Ein-Tag-im-Leben-eines-Softwarearchitekten-Ueberleben-im-Unternehmensdschungel-10283764.html";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
