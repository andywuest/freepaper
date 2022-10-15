package de.jos.freepaper.servlets;

import de.jos.freepaper.Constants;
import de.jos.freepaper.service.SupportedPage;
import de.jos.freepaper.service.config.ProxyConfiguration;
import de.jos.freepaper.service.download.JSoupDownload;
import io.github.lukehutch.fastclasspathscanner.FastClasspathScanner;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.ConnectException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FreepaperOptimizerServlet extends HttpServlet {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 2407986589647357402L;

    private ProxyConfiguration proxyConfiguration = null;

    private final List<SupportedPage> supportedPages = new ArrayList<>();

    @Override
    public void init(ServletConfig config) {
        final String proxyHostString = config.getInitParameter("proxyHost");
        final String proxyPortString = config.getInitParameter("proxyPort");

        System.out.println("ProxyHost : " + proxyHostString);
        System.out.println("ProxyPort : " + proxyPortString);

        // set the global list that contains the stories
        System.out.println("Setting up context list for stories !");
        config.getServletContext().setAttribute(Constants.APP_CONTEXT_STORIES, new ArrayList<>());

        if (!StringUtils.isBlank(proxyHostString) && !StringUtils.isBlank(proxyPortString)) {
            proxyConfiguration = new ProxyConfiguration();
            proxyConfiguration.setProxyHost(proxyHostString);
            proxyConfiguration.setProxyPort(Integer.valueOf(proxyPortString));
        }

        // find all supported pages
        final List<Class<? extends SupportedPage>> supportedPageClasses = new ArrayList<>();
        new FastClasspathScanner("de.jos").matchSubclassesOf(SupportedPage.class, supportedPageClasses::add).scan();

        supportedPageClasses.forEach(item -> registerSupportedPage(supportedPages, item));
    }

    private void registerSupportedPage(List<SupportedPage> supportedPages, Class<? extends SupportedPage> clazz) {
        try {
            final SupportedPage newInstance = clazz.newInstance();
            System.out.println("  * " + clazz.getName() + " - " + newInstance.getName());
            supportedPages.add(newInstance);
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(FreepaperOptimizerServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        final String requestedUrl = request.getParameter("url");
        final String timestamp = request.getParameter("t");

        System.out.println("targetUrl : " + requestedUrl);
        System.out.println("timestamp : " + timestamp);

        Path path = null;

        try {

            final SupportedPage page = determineSupportedPage(requestedUrl);

            if (page != null) {
                System.out.println("Page        : " + page.getName());

                JSoupDownload jsoupDownload = new JSoupDownload();
                path = jsoupDownload.performDownload(page, proxyConfiguration, requestedUrl, timestamp, request.getServletContext());

                if (path != null) {
                    response.getWriter().write(new String(Files.readAllBytes(path)));
                    System.out.println("Deleting tmp file : " + path);
                    Files.delete(path);
                } else {
                    response.getWriter().write("Failed to download page and extract article");
                }

            } else {
                response.getWriter().write("Page not supported !");
            }

        } catch (ConnectException ex) {
            Logger.getLogger(JSoupDownload.class.getName()).log(Level.SEVERE, "Failed to connect to host to download : " + requestedUrl, ex);
        } catch (Exception ex) {
            Logger.getLogger(JSoupDownload.class.getName()).log(Level.SEVERE, null, ex);
            if (path != null) {
                Files.delete(path);
            }
        }
    }

    private SupportedPage determineSupportedPage(String targetUrl) {
        return supportedPages.stream().filter(page -> page.matchesURL(targetUrl)).findFirst().orElse(null);
//        for (SupportedPage currentPage : supportedPages) {
//            if (currentPage.matchesURL(targetUrl)) {
//                return (SupportedPage) currentPage;
//            }
//        }
//
//        return null;
    }

}
