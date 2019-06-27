package com.books.books.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Writer {
	@Id 
	@GeneratedValue
	private Long id;	
	private String Name;
	private Date birthDay;
	
//	@ManyToMany(cascade = CascadeType.ALL)
//	private List<Book> books;
	
	@OneToMany(
			cascade = CascadeType.ALL,
			mappedBy="writer")
	private List<Book_Writer> writer_books;
	
	public Writer() {}

	public Writer(Long id, String name, Date birthDay) {
		super();
		this.id = id;
		Name = name;
		this.birthDay = birthDay;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public List<Book_Writer> getBooks() {
		return writer_books;
	}

	public void addBook(Book_Writer writer_books) {
		this.writer_books.add(writer_books);
	}

	public List<Book_Writer> getWriter_books() {
		return writer_books;
	}

	public void setWriter_books(List<Book_Writer> writer_books) {
		this.writer_books = writer_books;
	}
	
	
 
	
}
