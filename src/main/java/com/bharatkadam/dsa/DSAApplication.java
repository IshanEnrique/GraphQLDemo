package com.bharatkadam.dsa;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class DSAApplication implements CommandLineRunner {

	@Value("${dataPath}")
	private String path;

	public static void main(String[] args) {
		SpringApplication.run(DSAApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		}

}
