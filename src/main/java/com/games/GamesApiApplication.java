package com.games;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class GamesApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GamesApiApplication.class, args);

	}

}
