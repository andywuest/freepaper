package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import java.util.List;

/**
 * Incredible bad HTML markup - not infos in the div tags :-(
 *
 * @author awuest
 */
public class Faz extends SupportedPage {

    @Override
    public String getName() {
        return "faz.net";
    }

    @Override
    public String getPrintURL(String url) {
        return url + "?service=printPreview";
    }

    @Override
    public List<String> getRemovableElements() {
        final List<String> elements = super.getRemovableElements();
        elements.add("script");
        elements.add("style");
        elements.add("svg");
        elements.add("figure");
        elements.add("footer");
        return elements;
    }

}
