package com.redonearth.androidjsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)
@ComponentScan(basePackages = "com.redonearth.androidjsp")
public class AndroidJspApplication {

    public static void main(String[] args) {
        SpringApplication.run(AndroidJspApplication.class, args);
    }

}
