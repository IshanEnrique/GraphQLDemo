package com.graphpl.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graphpl.demo.entity.Book;
import com.graphpl.demo.repo.BookRepository;
import com.graphpl.demo.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;

	@Override
	public List<Book> getAll() {
		List<Book> bookList = (List<Book>) bookRepository.findAll();
		return bookList;
	}

	@Override
	public Book getBook(Long id) {
		return bookRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Book details not available."));
	}

	@Override
	public Book createBook(Book book) {
		return this.bookRepository.save(book);
	}

}
