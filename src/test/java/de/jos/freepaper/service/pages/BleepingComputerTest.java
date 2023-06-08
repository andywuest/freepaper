package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

import static org.junit.Assert.*;

public class BleepingComputerTest extends AbstractPageTest {

    private final SupportedPage page = new BleepingComputer();

    private static final String URL = "https://www.bleepingcomputer.com/news/microsoft/microsoft-365-outage-blocks-access-to-web-apps-and-services/";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}