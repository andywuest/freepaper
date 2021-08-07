package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

public class Dw extends SupportedPage {

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public String getName() {
        return "dw.com";
    }

    @Override
    public List<String> getRemovableElements() {
        final List<String> result = super.getRemovableElements();
        result.addAll(Arrays.asList( //
                "meta[name*='']", //
                "meta[property*='']", //
                "link[rel*='']", //
                "style", //
                "script", //
                "noscript", //
                "form", //
                "input", //
                "#topMeta", //
                "#topMetaLang", //
                "#navMeta", //
                "#quickjump", //
                "#navContainer", //
                "#footerSection", //
                ".adsContainer", //
                ".imgTeaserL", //
                ".imgTeaserM", //
                ".smallList", //
                ".cookie", //
                ".picBox" //
        ));
        return result;
    }


}
