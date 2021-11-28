package com.database.Demo;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SprinDatabaseExApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprinDatabaseExApplication.class, args);
	}
//working with swagger
	@Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/api/*"))
				.apis(RequestHandlerSelectors.basePackage("com.database"))
				.build()
				.apiInfo(apiDetails());
	}
	private ApiInfo apiDetails()
	{
		return new ApiInfo("Employers Details of Company",
				"sample api for employes",
				"2.0",
				"free to use",
				new springfox.documentation.
				service.
				Contact("Kamaji Indraksh", 
						"http://wavelabs.io",
						"abc@com"),
				"Api License",
				"http://wavelabs.io",
				Collections.emptyList());
	}
}
