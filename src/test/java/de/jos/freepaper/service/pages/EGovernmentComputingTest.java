package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

import static org.junit.Assert.*;

public class EGovernmentComputingTest extends AbstractPageTest {

    private final SupportedPage page = new EGovernmentComputing();

    private static final String URL = "https://www.egovernment-computing.de/cyberangriff-auf-it-systeme-der-landeshauptstadt-zieht-kreise-a-1067481/";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}


