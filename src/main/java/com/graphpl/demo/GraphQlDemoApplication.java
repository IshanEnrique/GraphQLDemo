package com.graphpl.demo;

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
import com.graphpl.demo.entity.Book;
import com.graphpl.demo.service.BookService;

@SpringBootApplication
public class GraphQlDemoApplication implements CommandLineRunner {

	@Value("${dataPath}")
	private String path;
	@Autowired
	private BookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(GraphQlDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		try (Stream<String> stream = Files.lines(Paths.get(path));

		) {

			stream.
		forEach(book -> {
				try {
					ObjectMapper mapper = new ObjectMapper();
					Book bookEntity = mapper.readValue(book, Book.class);
					this.bookService.createBook(bookEntity);
				} catch (JsonMappingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (JsonProcessingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			});

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.exit(1);

		}
	}

}
