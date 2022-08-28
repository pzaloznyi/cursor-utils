package com.pzaloznyi.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AutoConfig {
    @Bean
    public UUIDService uuidService() {
        return new UUIDService();
    }
}
