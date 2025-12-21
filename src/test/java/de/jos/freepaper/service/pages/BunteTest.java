package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

import static org.junit.Assert.*;

public class BunteTest extends AbstractPageTest {

    private final SupportedPage page = new Bunte();

    private static final String URL = "";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}