package de.jos.freepaper;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;

/**
 *
 * @author awuest
 */
public class FreepaperConfiguration extends Configuration {

    private String proxyHost;

    private Integer proxyPort;

    @JsonProperty
    public String getProxyHost() {
        return proxyHost;
    }

    @JsonProperty
    public void setProxyHost(String proxyHost) {
        this.proxyHost = proxyHost;
    }

    @JsonProperty
    public Integer getProxyPort() {
        return proxyPort;
    }

    @JsonProperty
    public void setProxyPort(Integer proxyPort) {
        this.proxyPort = proxyPort;
    }

}
