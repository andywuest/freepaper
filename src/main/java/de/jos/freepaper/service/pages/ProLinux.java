package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import java.util.List;

/**
 *
 * @author wuesand
 */
public class ProLinux extends SupportedPage {

    @Override
    public String getName() {
        return "pro-linux.de";
    }

    @Override
    public String getPrintURL(String url) {
        // reference for encodings http://www.i18nqa.com/debug/utf8-debug.html
        return url.replaceFirst("/news/1/", "/news/1/print/")
                .replaceAll("%C3%9C", "Ue")
                .replaceAll("%C3%BC", "ue"); // ue
    }

    @Override
    public List<String> getRemovableElements() {
        final List<String> elements = super.getRemovableElements();
        elements.add("link[href*='']");
        elements.add("img");
        elements.add("script");
        elements.add("noscript");
        elements.add(".print_links");
        elements.add(".imgartbox");
        elements.add("#item_block_special");
        elements.add("#pfooter");
        return elements;
    }

}
