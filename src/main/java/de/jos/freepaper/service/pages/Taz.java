package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author awuest
 */
public class Taz extends SupportedPage {

    @Override
    public String getName() {
        return "taz.de";
    }

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public List<String> getRemovableElements() {
        final List<String> result = super.getRemovableElements();
        result.addAll(Arrays.asList( //
                "link[rel*='']", //
                "meta[name*='']", //
                "meta[property*='']", //
                "script", //
                "style", //
                "noscript", //
                "img", //
                "#globalnavigation", //
                ".head", //
                ".toolbar", //
                ".tail", //
                ".sitemap", //
                ".article.leaded", //
                ".newsnavigation", //
                ".full.community.page" //
        ));
        return result;
    }

}
