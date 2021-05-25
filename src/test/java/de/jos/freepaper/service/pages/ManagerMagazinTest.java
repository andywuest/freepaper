package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class ManagerMagazinTest extends AbstractPageTest {

    String URL = "https://www.manager-magazin.de/unternehmen/autoindustrie/elektroauto-foerderungen-in-usa-wie-sich-deutsche-autobauer-auf-joe-bidens-infrastruktur-plan-vorbereiten-a-6f7f3ad7-60f5-48ec-b075-65ec7b7aa31c";

    private final SupportedPage page = new ManagerMagazin();

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
