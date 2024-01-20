package com.samedov.springbootexplore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBootExploreApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootExploreApplication.class, args);
    }

}
