package com.msc.rs.msc.registryserver.configuration;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class VersionConfiguration {
    @Value("${msc.app.version}")
    public String version;

    @PostConstruct
    public void postConstruct(){
        log.info("running Management System College Registry Server MSC-REGISTRY-SERVER version: {}",this.version
        );
    }
}
