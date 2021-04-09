package de.jos.freepaper.service.config;

import java.io.Serializable;

public class ProxyConfiguration implements Serializable {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 2407986589647357403L;

    private String proxyHost = null;

    private Integer proxyPort = null;

    public String getProxyHost() {
        return proxyHost;
    }

    public void setProxyHost(String proxyHost) {
        this.proxyHost = proxyHost;
    }

    public Integer getProxyPort() {
        return proxyPort;
    }

    public void setProxyPort(Integer proxyPort) {
        this.proxyPort = proxyPort;
    }

    public String getProxyString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(getProxyHost()).append(":");
        sb.append(getProxyPort());
        return sb.toString();
    }

}
