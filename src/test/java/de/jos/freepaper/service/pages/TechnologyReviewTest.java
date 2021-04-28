package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.junit.Test;

import static org.junit.Assert.*;

public class TechnologyReviewTest extends AbstractPageTest {

    private final SupportedPage page = new TechnologyReview();

    private static final String URL = "https://www.technologyreview.com/2021/04/15/1022895/us-sanctions-russia-positive-hacking/";

    @Test
    public void getDownload() {
        performDownload(page, URL);
    }

}