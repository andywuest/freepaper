package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import java.util.Arrays;
import java.util.List;

/**
 * @author awuest
 */
public class DeutscheWirtschaftsNachrichten extends SupportedPage {

    @Override
    public String getName() {
        return "deutsche-wirtschafts-nachrichten.de";
    }

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public boolean supportsArticle() {
        return true;
    }

    @Override
    public List<String> getRemovableElements() {
        final List<String> result = super.getRemovableElements();
        result.addAll(Arrays.asList( //
                "link[rel*='']", //
                "script", //
                "style", //
                "noscript", //
                ".entry-logo", //
                ".entry-tools", //
                ".entry-social", //
                ".ankuendigung", //
                ".wp-caption-text", //
                "img" // 
        ));
        return result;
    }

}
