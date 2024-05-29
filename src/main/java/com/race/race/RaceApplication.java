package com.race.race;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication  //(exclude={DataSourceAutoConfiguration.class})
//@ComponentScan(basePackages = "com.race.race.entites")

public class RaceApplication {

	public static void main(String[] args)
	{SpringApplication.run(RaceApplication.class, args);}

	@Configuration
	public class CorsConfig implements WebMvcConfigurer {

		@Override
		public void addCorsMappings(CorsRegistry registry) {
			registry.addMapping("/**")
					.allowedOrigins("http://localhost:3000") // Allow requests from this origin
					.allowedMethods("GET", "POST", "PUT", "DELETE"); // Allowed HTTP methods
		}
	}
	}
