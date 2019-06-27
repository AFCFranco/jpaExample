package com.books.books.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.books.books.entity.Book;
import com.books.books.entity.Writer;

public interface IBookService {
	public Book save(Book book);
	public Page<Book> findAll(Pageable pageable);
	public List<Book> findAll();
	public void delete(Book book);
	

}
