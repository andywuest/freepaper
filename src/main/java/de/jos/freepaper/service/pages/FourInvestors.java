package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author awuest
 */
public class FourInvestors extends SupportedPage {

    @Override
    public String getName() {
        return "4investors.de";
    }

    @Override
    public String getPrintURL(String url) {
        return url;
    }

    @Override
    public List<String> getRemovableElements() {
        // contains virtually no usable ids and classes :-(
        final List<String> result = super.getRemovableElements();
        result.addAll(Arrays.asList( //
                "meta[name*='']", //
                "meta[property*='']", //
                "meta[http-equiv*='']", //
                "link[rel*='']", //
                "style", //
                "header", //
                "footer", //
                "img", //
                "ins", //
                "#sidebar", //
                ".nav.nav-tabs", //
                ".breadcrumbs", //
                ".news-meta", //
                ".tradingview-widget-container", //
                ".contentempfehlung", //
                ".newsletter", //
                ".advertisement", //
                ".news-overview", //
                ".news.special", //
                "form", //
                "figure", //
                "script" //
        ));
        return result;
    }
    
    
}
