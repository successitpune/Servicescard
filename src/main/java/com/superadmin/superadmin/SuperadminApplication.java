package com.superadmin.superadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class SuperadminApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuperadminApplication.class, args);
	}
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
