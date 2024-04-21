package com.bharatkadam.dsa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.bharatkadam.*")
public class DSAApplication implements CommandLineRunner {
	@Autowired
	private BaseComponent baseComponent;

	public static void main(String[] args) {
		SpringApplication.run(DSAApplication.class, args);
		System.exit(0);
	}

	@Override
	public void run(String... args) throws Exception {
		baseComponent.start();
	}

}
