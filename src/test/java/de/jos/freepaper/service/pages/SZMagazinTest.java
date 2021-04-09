/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

/**
 *
 * @author awuest
 */
public class SZMagazinTest extends AbstractPageTest {

    private static final String URL = "https://sz-magazin.sueddeutsche.de/abschiedskolumne/plastik-plastik-ueberall-85684";

    final SupportedPage page = new SZMagazin();

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}
