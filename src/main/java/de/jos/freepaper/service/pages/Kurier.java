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
public class Kurier extends SupportedPage {

    @Override
    public String getName() {
        return "kurier.at";
    }

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public List<String> getRemovableElements() {
        final List<String> result = super.getRemovableElements();
        result.addAll(Arrays.asList( //
          "meta[name*='']", //
          "meta[property*='']", //
          "base[href*='']", //
          "link[href*='']", //
          "style", //
          "header", //
          "figure", //
          "img", //
          "script", //
          ".adContainer", //
          ".also-interesting-relaunch", //
          ".tags", //
          ".mobile-redirect", //
          ".copyright", //
          ".comment-box", //
          ".headlinedivider", //
          ".social-media-container", //
          ".cd-top", //
          "footer" //
        ));
        return result;
    }

}
