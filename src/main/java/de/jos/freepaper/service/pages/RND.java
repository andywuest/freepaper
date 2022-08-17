package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.Arrays;
import java.util.List;

public class RND extends SupportedPage {
    @Override
    public String getName() {
        return "rnd.de";
    }

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public List<String> getRemovableElements() {
        return Arrays.asList(
                "meta[content*='']", //
                "meta[name*='']", //
                "meta[link*='']", //
                "meta[property*='']", //
                "meta[http-equiv*='']", //
                "link[rel*='']", //
                "header", //
                "footer", //
                "button", //
                "script", //
                "nav", //
                "svg", //
                "picture", //
                "figure", //
                "style", //
                "div[class^=ChainContainerstyled__ChainContainer]", //
                "div[class^=TabBarstyled__TabBar]", //
                "div[class^=SideMenustyled]", //
                "div[class^=recommendationstyled__RecommendationContainer]", //
                "div[class^=TagListstyled__TagList]", //
                "div[class^=MoreItemsBlockstyled__MoreItemsBlock]", //
                "div[class^=Adstyled__AdWrapper]", //
                "noscript" //
        );
    }
}
