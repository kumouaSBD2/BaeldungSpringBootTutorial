package com.example.BaeldungSpringBootTutorial;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ServletComponentScan
@SpringBootApplication(scanBasePackages = "com.baeldung")
@EnableJpaRepositories("com.baeldung.persistence.repo")
@EntityScan("com.baeldung.persistence.model")
public class BaeldungSpringBootTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaeldungSpringBootTutorialApplication.class, args);
	}

}