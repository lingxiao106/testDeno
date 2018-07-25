package com.test.demo.ftp;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DownLoadRoute extends RouteBuilder {
    private static Logger logger = LoggerFactory.getLogger(DownLoadRoute.class);

    @Value("${ftp.server.info}")
    private String sftpServer;
    @Value("${ftp.local.dir}")
    private String downloadLocation;


    @Autowired
    LocationFileProcessor locationFileProcessor;

    @Override
    public void configure() throws Exception {
        from(downloadLocation).process("locationFileProcessor").to(sftpServer).log(LoggingLevel.INFO, logger, "Downloaded file ${file:name} complete.");
    }
}

