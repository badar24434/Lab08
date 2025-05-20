
package com.csc3402.lab.lab08;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class Lab08Application {

    public static void main(String[] args) {
        SpringApplication.run(Lab08Application.class, args);
    }
}