package de.jos.freepaper.service.pages;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Ignore;
import org.junit.Test;

public class SpiegelTest extends AbstractPageTest {

    private static final String URL = "https://www.spiegel.de/netzwelt/games/valheim-wikingerglueck-im-lockdown-a-ce585fa7-a27d-4fb1-810e-710139303914";

    private final Spiegel page = new Spiegel();

    @Ignore
    @Test
    public void getPrintUrl_shouldReturnPrintUrl() {
        final String printUrl = page.getPrintURL(URL);
        final String expectedUrl = "http://www.spiegel.de/spiegel/niedersachsens-lka-chef-uwe-kolmey-zum-raf-trio-a-1116066-druck.html";

        assertThat(printUrl).isEqualTo(expectedUrl);
    }

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

    @Ignore
    @Test
    public void getDownload2() {
        performDownload(page, "http://www.spiegel.de/wirtschaft/unternehmen/start-ups-hype-um-gruenderszene-verdeckt-ihre-wahre-lage-a-1121623.html");
    }

//    @Ignore
//    @Test
//    public void deobfuscate() {
//        final String text = "<a>xx</a> hfi÷su";
//        assertThat(page.deobfuscate(text)).isEqualTo("<a>xx</a> gehört");
//        System.out.println(page.deobfuscate(text));
//    }

}
