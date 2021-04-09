package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

public class Nachdenkseiten extends SupportedPage {

    @Override
    public String getName() {
        return "nachdenkseiten.de";
    }

    @Override
    public Charset getCharset() {
        return StandardCharsets.ISO_8859_1;
    }

    @Override
    public String getPrintURL(String url) {
        return url.replace("/?p=", "/wp-print.php?p=");
    }

    @Override
    public List<String> getRemovableElements() {
        final List<String> result = super.getRemovableElements();
        result.addAll(Arrays.asList( //
                "style", //
                "img", //
                "audio", //
                "#Divider", //
                "#powerpress_player_2606", //
                ".powerpress_links", //
                ".sharedaddy" //
        ));
        return result;
    }

}
