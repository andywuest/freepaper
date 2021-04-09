package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class ManagerMagazinTest extends AbstractPageTest {

    String URL = "https://www.manager-magazin.de/finanzen/versicherungen/riester-und-ruerup-rente-durch-zwangsversicherung-zur-rentenkuerzung-a-d897dac4-f273-41d9-81a3-f2a6286489f2";

    private final SupportedPage page = new ManagerMagazin();

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
