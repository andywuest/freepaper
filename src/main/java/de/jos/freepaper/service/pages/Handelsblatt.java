package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author awuest
 */
public class Handelsblatt extends SupportedPage {

    @Override
    public Charset getCharset() {
        return StandardCharsets.ISO_8859_1;
    }

    @Override
    public String getPrintURL(String url) {
        final Pattern pattern = Pattern.compile(".*(/\\d*.html)");
        final Matcher matcher = pattern.matcher(url);
        if (matcher.find()) {
            final String matchedGroup = matcher.group(1);
            return url.replaceAll(matchedGroup, "/v_detail_tab_print" + matchedGroup);
        }
        System.out.println("Pattern not found ! URL not changed ! ");
        return url;
    }

    @Override
    public boolean removeAllLinks() {
        return false;
    }

    @Override
    public String getName() {
        return "handelsblatt.com";
    }

    @Override
    public List<String> getRemovableElements() {
        return Arrays.asList(//
                "meta[content*='']", //
                "link[href*='']", //
                "script", //
                "style", //
                "#ivw", //
                ".iq", //
                ".vhb-colon", //
                "aside", //
                "iframe", //
                "section", //
                "figcaption", //
                "figure", //
                "form", //
                "img", //
                "svg", //
                "#karte", //
                "link[rel*='']", //
                ".opinary-widget-wrapper", //
                ".vhb-article-print-header", //
                ".vhb-g-embed-v2-container", //
                ".vhb-article-element", //
                ".vhb-teaser.vhb-type-video", //
                ".hcf-redaktion", //
                ".vhb-article__content-element--shorttextgallery", //
                ".vhb-article-print-footer" //
        );
    }

}
