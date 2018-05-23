package com.design.colsmart;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by Administrator on 2017/5/8.
 */

@SpringBootApplication
@ConfigurationProperties(prefix="application")
public class DesignColsmartApplication {
    private final static Logger logger = Logger.getLogger(DesignColsmartApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DesignColsmartApplication.class, args);
    }


}