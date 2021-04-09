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
public class Golem extends SupportedPage {

    @Override
    public String getName() {
        return "golem.de";
    }

    @Override
    public Charset getCharset() {
        return StandardCharsets.ISO_8859_1;
    }

    @Override
    public String getPrintURL(String url) {
        final Pattern pattern = Pattern.compile(".*-(\\d*).html");
        final Matcher matcher = pattern.matcher(url);
        if (matcher.find()) {
            final String matchedGroup = matcher.group(1);
            return url.replaceAll("golem.de.*", "golem.de/print.php?a=" + matchedGroup);
        }
        System.out.println("Pattern not found ! URL not changed ! ");
        return url;
    }

    @Override
    public List<String> getRemovableElements() {
        return Arrays.asList( //
          "link[rel*='']", //
          "script", //
          "noscript", //
          "style", //
          "img" //
        );
    }

}
