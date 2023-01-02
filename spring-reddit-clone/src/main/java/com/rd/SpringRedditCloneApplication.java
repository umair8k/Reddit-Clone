package com.rd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;

import com.rd.config.SwaggerConfiguration;

@SpringBootApplication
@EnableAsync
@Import(SwaggerConfiguration.class)
public class SpringRedditCloneApplication {

    public static void main(String[] args) {
        SpringApplication.run(com.rd.SpringRedditCloneApplication.class, args);
    }

}
