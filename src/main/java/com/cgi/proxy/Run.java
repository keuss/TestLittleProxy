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
        int port = System.getProperty("proxyPort") != null ? Integer.parseInt(System.getProperty("proxyPort")) : 8080;
        LOGGER.info("Stating HttpProxyServer with port : {}", port);
        // For acceptor threads, incoming worker threads and outgoing worker thread =>
        // .withThreadPoolConfiguration(new ThreadPoolConfiguration().withClientToProxyWorkerThreads(10).withProxyToServerWorkerThreads(10))
        HttpProxyServer server =
                DefaultHttpProxyServer.bootstrap()
                        .withPort(port)
                        .start();
        LOGGER.info("ConnectTimeout : {}", server.getConnectTimeout());
        LOGGER.info("IdleConnectionTimeout : {}", server.getIdleConnectionTimeout());
        LOGGER.info("ListenAddress : {}", server.getListenAddress());
    }
}
