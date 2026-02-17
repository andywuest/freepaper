package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.util.Arrays;
import java.util.List;

public class Capital extends SupportedPage {

    @Override
    public String getName() {
        return "capital.de";
    }

    @Override
    public boolean removeEmptyTags() {
        return true;
    }

    @Override
    public List<String> getRemovableElements() {
        final List<String> removableElements = super.getRemovableElements();
        removableElements.addAll(
                Arrays.asList(
                        "meta[name*='']", //
                        "meta[property*='']", //
                        "link[rel*='']", //
                        "nav", //
                        "header", //
                        "footer", //
                        "ws-adtag", //
                        "ws-dialog", //
                        "ws-scroller", //
                        "ws-link", //
                        "ws-messagehandler", //
                        "ws-copylink", //
                        "ws-vgwort", //
                        "ws-nielsen", //
                        "ws-gtm", //
                        "ws-push", //
                        "ws-iframeresizer", //
                        "ws-user", //
                        "ws-sourcepoint", //
                        "ws-upscore", //
                        "ws-snackbar", //
                        "ws-netid", //
                        "ws-outbrain", //
                        "ws-paywallcontrol", //
                        "ws-adscript", //
                        "ws-drawer", //
                        ".tags", //
                        ".group-teaser-gallery", //
                        ".article__end", //
                        ".teaser", //
                        ".teaser-plaintext", //
                        ".ad-container" //

                )
        );
        return removableElements;
    }

}
