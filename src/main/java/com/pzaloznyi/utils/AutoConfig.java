package com.pzaloznyi.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public UUIDService uuidService() {
        return new UUIDService();
    }
}
