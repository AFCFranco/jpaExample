package com.books.books.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Book {
	@Id
	@GeneratedValue
	private Long id;
	@Column
	private String title;	
//	@ManyToMany(mappedBy = "books",cascade = CascadeType.ALL)
//	private List<Writer> writes;
	
	@OneToMany(
			cascade = CascadeType.ALL,
			mappedBy="book")
	private List<Book_Writer> book_writer;
	
	public Book() {}
	public Book(Long id, String title) {
		super();
		this.id = id;
		this.title = title;
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public List<Book_Writer> getBook_writer() {
		return book_writer;
	}
	public void setBook_writer(List<Book_Writer> book_writer) {
		this.book_writer = book_writer;
	}


	
	

}
