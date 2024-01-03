package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.Arrays;
import java.util.List;

public abstract class AbstractHeise extends SupportedPage {

    @Override
    public List<String> getRemovableElements() {
        final List<String> removableElements = super.getRemovableElements();
        removableElements.addAll(
                Arrays.asList( //
                        "a-ad", //
                        "a-analytics", // special tag
                        "a-android-native-app-prompt", //
                        "a-bilderstrecke", //
                        "a-click-performance", //
                        "a-collapse", // special tag
                        "a-iframe", //
                        "a-lightbox", // special tag
                        "a-login", //
                        "a-opt-in", //
                        "a-paternoster", //
                        "a-script", //
                        "a-sticky-footer", //
                        "a-teaser" // special tag
                ));
        return removableElements;
    }

}
