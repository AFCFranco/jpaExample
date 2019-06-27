package com.books.books.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.books.books.entity.Book;
import com.books.books.repository.BookRepo;
import com.books.books.repository.BookRepository;
import com.books.books.service.IBookService;



@Service
public class BookImpService implements IBookService {
	
	@Autowired
	BookRepository br;
	@Override
	public Book save(Book book) {
		br.save(book);	
		return book;
	}
	
	@Override
	public Page<Book> findAll(Pageable pageable) {
		return br.findAll(pageable);
	
	}

	@Override
	public List<Book> findAll() {
		return br.findAll();		
	}

	@Override
	public void delete(Book book) {
		br.deleteById(book.getId());	
	}
}
