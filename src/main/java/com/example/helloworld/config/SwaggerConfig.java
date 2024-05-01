package com.example.helloworld.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
@OpenAPIDefinition
public class SwaggerConfig {

	@Bean
	public OpenAPI openApi() {
		Info info = new Info()
				.title("Hello World Project")
				.version("v1")
				.description("Hello World Project swagger api");
		
		return new OpenAPI().components(new Components()).info(info);
	}
}
