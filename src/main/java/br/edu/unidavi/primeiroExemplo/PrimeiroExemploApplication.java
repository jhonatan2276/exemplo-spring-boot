package br.edu.unidavi.primeiroExemplo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class PrimeiroExemploApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(PrimeiroExemploApplication.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(PrimeiroExemploApplication.class, args);
	}
}
