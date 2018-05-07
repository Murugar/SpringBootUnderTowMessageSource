package com.iqmsoft;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application {

    public static final Locale FIXED_LOCALE = new Locale("EN", "us");

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
