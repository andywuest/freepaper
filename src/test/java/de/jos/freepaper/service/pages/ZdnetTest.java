package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class ZdnetTest extends AbstractPageTest {

    final SupportedPage page = new Zdnet();

    private static final String URL = "https://www.zdnet.com/article/chinese-companies-have-leaked-over-590-million-resumes-via-open-databases/";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
