package com.books.books.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Book_Writer {
	@Id
	@GeneratedValue
	Long id;
	
	@ManyToOne(
			 cascade = CascadeType.ALL
			)
	private Book book;
	
	@ManyToOne(
			 cascade = CascadeType.ALL
			)
	private Writer writer;

}
