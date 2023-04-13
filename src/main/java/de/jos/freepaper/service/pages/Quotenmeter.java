package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import org.glassfish.jersey.uri.UriComponent;

import javax.ws.rs.core.MultivaluedMap;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class Quotenmeter extends SupportedPage {

    @Override
    public String getName() {
        return "quotenmeter.de";
    }

    @Override
    public Charset getCharset() {
        return StandardCharsets.ISO_8859_1;
    }

    @Override
    public String getPrintURL(String url) {
        final MultivaluedMap<String, String> queryMap = UriComponent.decodeQuery(url, true);
        final String id = queryMap.containsKey("p2") ? queryMap.get("p2").get(0) : "";
        return "https://www.quotenmeter.de/cms/print.php?id=" + id;
    }

    @Override
    public List<String> getRemovableElements() {
        final List<String> removableElements = super.getRemovableElements();
        removableElements.add("img");
        removableElements.add("iframe");
        removableElements.add("link");
        removableElements.add(".qm-infobox");
        return removableElements;
    }
}
