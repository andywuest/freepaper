package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.Arrays;
import java.util.List;

public class Bunte extends SupportedPage {

    @Override
    public String getName() {
        return "bunte.de";
    }

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public boolean removeEmptyTags() {
        return true;
    }

    @Override
    public List<String> getRemovableElements() {
        final List<String> result = super.getRemovableElements();
        result.addAll(Arrays.asList( //
                "meta[name*='']", //
                "meta[property*='']", //
                "meta[http-equiv*='']", //
                "link[rel*='']", //
                "header", //
                "nav", //
                "meta", //
                "footer", //
                ".Article-Image", //
                ".Ad-Carousel", //
                ".Ad-Slot", //
                ".Article-ArticlesBox", //
                ".Ad-Slot-Sticky-Container", //
                ".LinkBox_ForDesktop", //
                ".Ad-Slot-Sticky--Right", //
                ".Article-Content-Gallery" //

        ));
        return result;
    }

}
