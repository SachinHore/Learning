package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket docket() {
        /*Docket. bean in a Spring Boot configuration to configure Swagger 2 for the application.
        A Springfox. Docket. instance provides the primary API configuration with sensible defaults
        and convenience methods for configuration */
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select().build();
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder().title("Student Management System API")
                .description("This API provides CRUD operations on Student Management System")
                .version("V1.0").build();
    }
}

