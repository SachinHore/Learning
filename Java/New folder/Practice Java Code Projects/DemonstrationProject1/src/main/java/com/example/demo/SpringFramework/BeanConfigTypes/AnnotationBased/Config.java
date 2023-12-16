package com.example.demo.SpringFramework.BeanConfigTypes.AnnotationBased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Config {
    @Bean
    public Employee employee() {
        return new Employee();
    }

    @Bean
    public Address address() {
        return new Address();
    }

}
