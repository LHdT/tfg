package edu.upo.lhiddt.tfg.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring boot application runner
 * 
 * @author porman
 *
 */
@SpringBootApplication(scanBasePackages = "edu.upo.lhiddt.tfg")
public class App {
	public static void main(String[] args) {
		
		SpringApplication.run(App.class, args);
	}
}
