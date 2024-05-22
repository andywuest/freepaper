package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.Arrays;
import java.util.List;

public class Brigitte extends SupportedPage {

    @Override
    public String getName() {
        return "brigitte.de";
    }

    @Override
    public String getPrintURL(String url) {
        return url;
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
                "dialog", //
                "input", //
                "img", //
                "x-drawer", //
                "x-token", //
                "x-snackbar", //
                "x-bookmarkbutton", //
                ".breadcrumb", //
                ".js-sidebar", //
                ".menu__list", //
                ".group-teaserblock", //
                ".group__headline", //
                ".group-teaserlist", //
                ".article__links", //
                ".article__tags", //
                ".links--linkbox-category", //
                ".footer-teaserblock", //
                ".credits-author-source", //
                "#sidebar-headline", //
                "#sidebar-teaser", //
                "footer" //
        ));
        return result;
    }

}
