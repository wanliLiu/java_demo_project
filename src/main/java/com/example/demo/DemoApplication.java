package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@SpringBootApplication
@EnableSwagger2WebMvc
@ComponentScan("com.example.demo")
public class DemoApplication {

    //	http://localhost:8080/swagger-ui.html
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
