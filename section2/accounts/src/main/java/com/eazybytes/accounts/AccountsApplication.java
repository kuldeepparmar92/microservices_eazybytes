package com.eazybytes.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts Microservice REST API Documentation",
				description = "EazyBank Accounts Microservices REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Kuldeepsinh Parmar",
						email = "kuldeepparmar92@gmail.com",
						url = "http://www.ermin.co.in"
				),
				license = @License(
						name = "Apache 2.0",
						url = "http://www.ermin.co.in"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "EazyBank Accounts Microservices REST API Documentation",
				url = "http://www.ermin.co.in/swagger-ui.html"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}