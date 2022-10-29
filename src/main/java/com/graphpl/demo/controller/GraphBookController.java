package com.graphpl.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.graphpl.demo.entity.Book;
import com.graphpl.demo.model.BookInput;
import com.graphpl.demo.service.BookService;

@Controller
public class GraphBookController {

	@Autowired
	private BookService bookService;

	@QueryMapping("getAllBooks")
	public List<Book> getAllBook() {
		return this.bookService.getAll();
	}

	@QueryMapping("getBook")
	public Book getBookById(@Argument Long id) {
		return this.bookService.getBook(id);
	}

	@MutationMapping("createBook")
	public Book createBook(@Argument BookInput book) {
		return this.bookService.createBook(
				Book.build(0L, book.getName(), book.getAuthor(), book.getDesc(), book.getPublishedDate()));
	}

}
