package com.graphpl.demo.service;

import java.util.List;

import com.graphpl.demo.entity.Book;

public interface BookService {

//	GET ALL BOOKS
	public List<Book> getAll();

//	GET BOOK BY BOOKID
	public Book getBook(Long id);

//	CREATE NEW BOOK
	public Book createBook(Book book);
}
