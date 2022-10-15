package de.jos.freepaper;

import de.jos.freepaper.resources.StoriesResource;
import de.jos.freepaper.resources.StoryRemovalResource;
import de.jos.freepaper.resources.StoryResource;
import de.jos.freepaper.servlets.EPubDownloadServlet;
import de.jos.freepaper.servlets.FreepaperOptimizerServlet;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.dropwizard.views.ViewBundle;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletRegistration;

/**
 * @author awuest
 */
public class FreepaperApplication extends Application<FreepaperConfiguration> {

    public static void main(String args[]) throws Exception {
        new FreepaperApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<FreepaperConfiguration> bootstrap) {
        super.initialize(bootstrap);
        bootstrap.addBundle(new ViewBundle<>());
    }

    @Override
    public void run(FreepaperConfiguration configuration, Environment env) {
        // register epub download servlet
        final ServletRegistration.Dynamic epubDownloadServlet = env.servlets().addServlet("epubDownloadServlet", EPubDownloadServlet.class);
        epubDownloadServlet.addMapping("/EPubDownloadServlet");
        epubDownloadServlet.setLoadOnStartup(1);

        // register optimizer servlet
        final ServletRegistration.Dynamic freepaperOptimizerServlet = env.servlets().addServlet("freepaperOptimizerServlet", FreepaperOptimizerServlet.class);
        if (StringUtils.isNotBlank(configuration.getProxyHost())) {
            freepaperOptimizerServlet.setInitParameter("proxyHost", configuration.getProxyHost());
            freepaperOptimizerServlet.setInitParameter("proxyPort", String.valueOf(configuration.getProxyPort()));
        }
        freepaperOptimizerServlet.addMapping("/FreepaperOptimizerServlet");
        freepaperOptimizerServlet.setLoadOnStartup(2);

        // register stories resource
        env.jersey().register(new StoriesResource());
        env.jersey().register(new StoryResource());
        env.jersey().register(new StoryRemovalResource());
    }

    @Override
    public String getName() {
        return "freepaper";
    }

}
