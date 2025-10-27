package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.Arrays;
import java.util.List;

public class BoerseAmSonntag extends SupportedPage {

    @Override
    public String getName() {
        return "boerse-am-sonntag.de/";
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
                "meta[content*='']", //
                "meta[property*='']", //
                "link[rel*='']", //
                "nav", //
                ".share", //
                ".newsInfo", //
                ".lightboxContent", //
                ".button-home", //
                ".rsbtn_text", //
                ".teaserMagazin", //
                ".newsTeaser", //
                ".bannerSidebarRightCol", //
                ".contentHeader", //
                "footer" //
        ));
        return result;
    }

}
