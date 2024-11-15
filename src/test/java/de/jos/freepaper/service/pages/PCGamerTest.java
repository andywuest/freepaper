package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

import static org.junit.Assert.*;

public class PCGamerTest extends AbstractPageTest {

    private final SupportedPage page = new PCGamer();

    private static final String URL = "https://www.pcgamer.com/games/rpg/5-years-after-it-was-yanked-off-stores-gogs-bringing-underrated-spy-rpg-alpha-protocol-in-from-the-cold-with-fewer-crashes-and-new-achievements/";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
