package com.tusaryan.linkedin.posts_service.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    //to map different dto to entities
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
