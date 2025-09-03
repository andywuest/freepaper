package de.jos.freepaper.service.pages;

import org.junit.Test;

/**
 * @author awuest
 */
public class FocusTest extends AbstractPageTest {

    @Test
    public void getDownload() {
        final Focus page = new Focus();
        final String url = "https://www.focus.de/familie/52-oberaerztin-verliebt-in-einen-gaertner-hatte-angst-vor-dem-gerede-der-anderen_9229bb13-ca11-42bd-beac-64308657531e.html";
        performDownload(page, url);
    }

}
