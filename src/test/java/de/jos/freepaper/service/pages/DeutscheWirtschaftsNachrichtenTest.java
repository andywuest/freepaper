package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class DeutscheWirtschaftsNachrichtenTest extends AbstractPageTest {

    private final SupportedPage page = new DeutscheWirtschaftsNachrichten();

    private static final String URL = "https://deutsche-wirtschafts-nachrichten.de/2018/10/20/erdogan-rentensystem-ist-nicht-mehr-finanzierbar/";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
