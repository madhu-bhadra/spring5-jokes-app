package com.springframework.spring5jokesapp;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
// A class declares one or more @Bean methods and may be processed by the
// Spring container to generate bean definitions
public class AppConfig {
    @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes(){
        return new ChuckNorrisQuotes();
    }
}
