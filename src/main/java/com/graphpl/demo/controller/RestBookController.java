package com.graphpl.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.graphpl.demo.entity.Book;
import com.graphpl.demo.service.BookService;

@RestController
@RequestMapping("/book")
public class RestBookController {

	@Autowired
	private BookService bookService;

	@GetMapping
	public List<Book> getAllBook() {
		return this.bookService.getAll();
	}

	@GetMapping("/{id}")
	public Book getBookById(@PathVariable Long id) {
		return this.bookService.getBook(id);
	}

	@PostMapping
	public Book createBook(@RequestBody Book book) {
		return this.bookService.createBook(book);
	}

}
