package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author awuest
 */
public class Netmoms extends SupportedPage {

    @Override
    public String getName() {
        return "www.netmoms.de";
    }

    @Override
    public List<String> getRemovableElements() {
        return Arrays.asList( //
                "meta[content*='']", //
                "link", //
                "script", //
                "noscript", // 
                "style", //
                "amp-social-share", // 
                "amp-img", // 
                "figure", //
                "aside", //
                "img" //
        );
    }

    @Override
    public boolean supportsArticle() {
        return true;
    }

    @Override
    public String getPrintURL(String url) {
        return url;
    }

}
