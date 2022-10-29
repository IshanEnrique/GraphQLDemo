package com.graphpl.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.graphpl.demo.entity.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

}
