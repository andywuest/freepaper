package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author wuesand
 */
public class Finanzdiva extends SupportedPage {

    @Override
    public String getName() {
        return "finanzdiva.de";
    }

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public List<String> getRemovableElements() {
        final List<String> result = super.getRemovableElements();
        return Arrays.asList( //
                "link", //
                "meta[name*='']", //
                "meta[property*='']", //
                "script", //
                "noscript", //
                "svg", //
                "nav", //
                ".evo-post-meta", //
                ".evo-post-image", //
                ".evo-tags", //
                ".evo-comment-list", //
                ".evo-sidebar", //
                ".evo-carousel-b", //
                ".evo-related-posts", //
                ".evo-post-directions", //
                ".evo-search-holder", //
                ".evo-trending-holder", //
                "header", //
                "footer" //
        );
    }

}
