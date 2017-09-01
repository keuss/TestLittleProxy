package com.cgi.proxy;

import org.littleshoot.proxy.HttpProxyServer;
import org.littleshoot.proxy.impl.DefaultHttpProxyServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by x153216 on 01/09/2017.
 */
public class Run {

    /**
     * LOGGER
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(Run.class);

    public final static void main(String[] args) throws Exception {
        LOGGER.info("Stating HttpProxyServer ...");
        HttpProxyServer server =
                DefaultHttpProxyServer.bootstrap()
                        .withPort(8080)
                        .start();
    }
}
