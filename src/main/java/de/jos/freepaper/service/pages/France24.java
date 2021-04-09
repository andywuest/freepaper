/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author awuest
 */
public class France24 extends SupportedPage {

    @Override
    public String getName() {
        return "france24.com";
    }

    @Override
    public List<String> getRemovableElements() {
        return Arrays.asList( //
          "link[rel*='']", //
          "meta[property*='']", //
          "meta[name*='']", //
          "style", //
          "script", //
          "noscript", //
          "header", //
          "footer", //
          "aside", //
          "nav", //
          "svg", //
          "figure", //
          "button", //
          "share-button", //
          "share-modal", //
          "#loading", //
          "#confirmAccountDeactivation", //
          "#changePassword", //
          "#janrain", //
          ".adv-megaban", //
          ".side-bar", //
          ".o-self-promo", //
          ".tms-block", //
          ".t-content__tags", //
          ".sharebar-social-part", //
          ".adv-megaban tms-block", //
          ".on-air-board-outer", //
          ".short-cuts-outer", //
          ".featured-contents" //
        );
    }

    @Override
    public String getPrintURL(String url) {
        return url;
    }

}
