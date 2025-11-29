package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.Arrays;
import java.util.List;

public class AugsburgerAllgemeine extends SupportedPage {

    @Override
    public String getName() {
        return "augsburger-allgemeine.de";
    }

    @Override
    public boolean removeAllLinks() {
        return true;
    }

    @Override
    public boolean removeEmptyTags() {
        return true;
    }

    @Override
    public List<String> getRemovableElements() {
        List<String> removableElements = super.getRemovableElements();
        removableElements.addAll(Arrays.asList(
                "meta[name*='']", //
                "meta[property*='']", //
                "link[crossorigin*='']", //
                "link[sizes*='']", //
                "link[rel*='']", //
                ".sticky", //
                ".print", //
                ".sdgSlotContainer", //
                ".externalContentBox", //
                "header", //
                "footer", //
                "details", //
                "dialog", //
                "template", //
                "defs", //
                "summary", //
                "nav" //
        ));
        return removableElements;
    }

}