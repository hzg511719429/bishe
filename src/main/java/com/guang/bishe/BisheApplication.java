package com.guang.bishe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BisheApplication {

    public static void main(String[] args) {
        SpringApplication.run(BisheApplication.class, args);
    }

}
