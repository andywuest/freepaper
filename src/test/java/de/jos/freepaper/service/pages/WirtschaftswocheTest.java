package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class WirtschaftswocheTest extends AbstractPageTest {

    private final SupportedPage page = new Wirtschaftswoche();

    private static final String URL = "https://www.wiwo.de/erfolg/management/dsw-aufsichtsratsstudie-2020-aufsichtsraete-fuerstlich-bezahlt-so-maechtig-wie-nie-zuvor/26593290.html";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }    
    
}
