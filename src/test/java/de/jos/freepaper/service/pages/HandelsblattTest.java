package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Ignore;
import org.junit.Test;

public class HandelsblattTest extends AbstractPageTest {

    final SupportedPage page = new Handelsblatt();

    private static final String URL = "https://www.handelsblatt.com/politik/deutschland/impfstoffgipfel-lieferfristen-zusagen-not-wirtschaft-so-will-die-bundesregierung-tempo-beim-impfen-machen/26872572.html";

    @Ignore
    @Test
    public void getPrintUrl_shouldReturnPrintUrl() {
        final Handelsblatt page = new Handelsblatt();
        final String printUrl = page.getPrintURL(URL);
        final String expectedUrl = "http://www.handelsblatt.com/finanzen/banken-versicherungen/mitarbeiterbrief-neuer-deutsche-bank-chef-sewing-fordert-jaegermentalitaet-von-seinen-mitarbeitern-/v_detail_tab_print/21153732.html";

        System.out.println("print url : " + printUrl);
        
        assertThat(printUrl).isEqualTo(expectedUrl);
    }

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
