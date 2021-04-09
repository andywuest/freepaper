package de.jos.freepaper.service.pages;

import de.jos.freepaper.service.SupportedPage;
import de.jos.freepaper.service.config.ProxyConfiguration;
import de.jos.freepaper.service.download.JSoupDownload;
import java.nio.file.Path;

public abstract class AbstractPageTest {

    public static final ProxyConfiguration PROXY_TSYSTEMS = null;
            // new ProxyConfiguration();

//    static {
//        PROXY_TSYSTEMS.setProxyHost("10.151.249.77");
//        PROXY_TSYSTEMS.setProxyPort(8080);
//    }

    public void performDownload(SupportedPage page, String url) {
        final JSoupDownload download = new JSoupDownload();
        final Path path = download.performDownload(page, PROXY_TSYSTEMS, url, "123123", null);

        System.out.println("path : " + path);
    }

}
