package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author awuest
 */
public class StuttgarterNachrichten extends SupportedPage {

    @Override
    public String getPrintURL(String url) {
        // TODO gleiche logik wie stuttgarter zeitung -> mal abgesehen von der URL 
        final Pattern pattern = Pattern.compile(".*\\.([\\w\\-]*).html");
        final Matcher matcher = pattern.matcher(url);
        if (matcher.find()) {
            final String matchedGroup = matcher.group(1);
            return "http://www.stuttgarter-nachrichten.de/inhalt.print." + matchedGroup + ".presentation.print.v2.html";
        }
        System.out.println("Pattern not found ! URL not changed ! ");
        return url;
    }

    @Override
    public String getName() {
        return "stuttgarter-nachrichten.de";
    }

    @Override
    public List<String> getRemovableElements() {
        final List<String> result = super.getRemovableElements();
        result.addAll(Arrays.asList( //
          "meta[name*='']", //
          "meta[property*='']", //
          "meta[http-equiv*='']", //
          "link[rel*='']", //
          "figure", //
          "header", //
          "noscript", //
          "script" //
        ));
        return result;
    }

}
