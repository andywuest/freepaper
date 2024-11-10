package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * @author awuest
 */
public class Focus extends SupportedPage {

    @Override
    public String getName() {
        return "focus.de";
    }

    @Override
    public boolean removeAllLinks() {
        return true;
    }

    @Override
    public Charset getCharset() {
        return StandardCharsets.ISO_8859_1;
    }

    @Override
    public boolean supportsArticle() {
        return false;
    }

    @Override
    public List<String> getRemovableElements() {
        final List<String> removableElements = super.getRemovableElements();
        removableElements.add("meta[name*='']");
        removableElements.add("meta[property*='']");
        removableElements.add("meta[name*='']");
        removableElements.add("link[rel*='']");
        removableElements.add("header");
        removableElements.add("footer");
        removableElements.add("#special-header-v2");
        removableElements.add("#skyscraper");
        removableElements.add("#servicev2");
        removableElements.add("#newsbreadcrumb");
        removableElements.add("#article-social");
        removableElements.add("#comment-wrapper");
        removableElements.add("#socialicons_sticky");
        removableElements.add("#inactivity_layer_bg");
        removableElements.add("#print_image_info");
        removableElements.add("#teaserRss");
        removableElements.add("#sidebar");
        removableElements.add("nav");
        removableElements.add("input");
        removableElements.add("svg");
        removableElements.add(".nocontent");
        removableElements.add(".groupon-list-container");
        removableElements.add(".Ad-Slot-Sticky--Right");
        removableElements.add(".Ad-Slot");
        removableElements.add(".Ad-Slot-970-Container");
        removableElements.add(".Ad-Slot-Sticky-Container");
        removableElements.add(".teaser");
        removableElements.add(".comments-banner");
        removableElements.add(".Article-Comments-Button");
        removableElements.add(".Article-Comments__LoginInfo");
        removableElements.add(".Article-Comments__Title");
        removableElements.add(".Article-Comments__AppUserActions");
        removableElements.add(".LinkBox_InnerContainer");
        removableElements.add("#links-box-placement-D");
        removableElements.add(".LinksBox_Container");
        removableElements.add(".container-article-inline-teaser");
        removableElements.add(".topRightTickerHolder");
        removableElements.add(".comments-background");
        removableElements.add(".comments-panel");
        removableElements.add(".container_multichart");
        removableElements.add(".teaserList-2");
        removableElements.add(".teaserList3x1");
        removableElements.add(".teaserList2x2");
        removableElements.add(".re_textteaserlist");
        removableElements.add(".teaserBlock");
        removableElements.add(".orange-button-artobj");
        removableElements.add(".article-social-border");
        removableElements.add(".actions");
        return removableElements;
    }

}
