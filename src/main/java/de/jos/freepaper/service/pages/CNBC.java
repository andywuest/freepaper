package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.Arrays;
import java.util.List;

public class CNBC extends SupportedPage {

    @Override
    public String getName() {
        return "cnbc.de";
    }

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public boolean removeAllLinks() {
        return true;
    }

    @Override
    public List<String> getRemovableElements() {
        return Arrays.asList( //
                "meta[name*='']", //
                "meta[property*='']", //
                "meta[itemType*='']", //
                "meta[content*='']", //
                "meta[http-equiv*='']", //
                "link[rel*='']", //
                "style", //
                "script", //
                "noscript", //
                "header", //
                "footer", //
                "button", //
                "img", //
                "#RegularArticle-RelatedQuotes", //
                "#MobileAdhesion-Homepage", //
                ".WildcardEmbed-wrapper", //
                ".RelatedContent-relatedContent", //
                ".WatchLiveRightRail-inline", //
                ".JumpLink-container", //
                ".InlineImage-imageEmbed", //
                ".InlineImage-wrapper", //
                ".CNBCGlobalNav-mobileNavMenu", //
                ".SidebarArticle-sidebar"
        );
    }

}