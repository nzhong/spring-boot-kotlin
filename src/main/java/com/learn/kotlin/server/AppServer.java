package com.learn.kotlin.server;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.Properties;

@ComponentScan("com.learn.kotlin")
@SpringBootApplication
public class AppServer {

    protected static Properties appProperties;

    public static void main(String[] args) {
        appProperties = new AppServerCliProperties(args).parseAndRead();

        SpringApplication.run(AppServer.class, args);
    }

    @Bean
    public PropertyPlaceholderConfigurer propertyPlaceholderConfigurer() {
        final PropertyPlaceholderConfigurer PROPERTY_CONFIG = new PropertyPlaceholderConfigurer();
        PROPERTY_CONFIG.setProperties(AppServer.appProperties);
        return PROPERTY_CONFIG;
    }
}
