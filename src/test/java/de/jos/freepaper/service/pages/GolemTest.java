package de.jos.freepaper.service.pages;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class GolemTest {

    @Test
    public void getPrintUrl_shouldReturnPrintUrl() {
        final Golem page = new Golem();
        final String printUrl = page.getPrintURL("http://www.golem.de/news/https-let-s-encrypt-entlarvt-ueberteuerte-zertifikate-1609-123406.html");
        final String expectedUrl = "http://www.golem.de/print.php?a=123406";

        assertThat(printUrl).isEqualTo(expectedUrl);
    }

}
