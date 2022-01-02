package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

import static org.junit.Assert.*;

public class BleepingComputerTest extends AbstractPageTest {

    private final SupportedPage page = new BleepingComputer();

    private static final String URL = "https://www.bleepingcomputer.com/news/security/ukraine-arrests-51-for-selling-data-of-300-million-people-in-us-eu/";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}