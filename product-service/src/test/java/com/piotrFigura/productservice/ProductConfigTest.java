package com.piotrFigura.productservice;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class ProductConfigTest {
    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }
}

