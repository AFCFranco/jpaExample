package com.books.books;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.books.books.entity.Book;
import com.books.books.entity.Writer;
import com.books.books.repository.BookRepo;
import com.books.books.repository.WriterRepo;

@SpringBootApplication
public class BooksApplication implements CommandLineRunner {

	@Autowired
	private BookRepo br;
	@Autowired
	private WriterRepo wr;
	public static void main(String[] args) {
		SpringApplication.run(BooksApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		Book b1=(br.findById(10001l));
		Writer w1=wr.findById(10002l);		
//		wr.addBook(10002l,10001l);
//		wr.addBook(10003l,10002l);
//		wr.addBook(10003l,10003l);
//		wr.printBooks(10003l);	
		
	}
	

}
