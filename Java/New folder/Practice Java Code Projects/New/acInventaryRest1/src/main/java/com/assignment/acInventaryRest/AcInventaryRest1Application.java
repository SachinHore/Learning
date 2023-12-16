package com.assignment.acInventaryRest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication(exclude= HibernateJpaAutoConfiguration.class)
public class AcInventaryRest1Application {

    public static void main(String[] args) {
        SpringApplication.run(AcInventaryRest1Application.class, args);
    }
}
