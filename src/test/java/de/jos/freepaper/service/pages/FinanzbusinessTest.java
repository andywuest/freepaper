package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

public class FinanzbusinessTest extends AbstractPageTest {

    final SupportedPage page = new Finanzbusiness();

    private static final String URL = "https://finanzbusiness.de/nachrichten/banken/article13582244.ece";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}