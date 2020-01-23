package org.softuni.kaizer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class KaizerWatchesApplication {

    public static void main(String[] args) {
        SpringApplication.run(KaizerWatchesApplication.class, args);
    }

}
