package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import java.util.Arrays;
import java.util.List;

public class Finanzbusiness extends SupportedPage {

    @Override
    public String getName() {
        return "finanzbusiness.de";
    }

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public List<String> getRemovableElements() {
        final List<String> removableElements = super.getRemovableElements();
        removableElements.addAll(Arrays.asList(
                "link[rel*='']", //
                "meta[name*='']", //
                "meta[property*='']", //
                "script", //
                "style", //
                "figure", //
                "svg", //
                ".c-site-header", //
                ".c-site-footer", //
                ".o-article__related", //
                ".c-social-media-sharing", //
                ".o-page__sidebar", //
                "[class^=u-hidden]" //
        ));
        return removableElements;
    }

}
