package com.books.books.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import com.books.books.entity.Book;
import com.books.books.entity.Writer;

@Transactional
@Repository
public class BookRepo {
	@Autowired
	EntityManager em;
	
	public Book findById(Long id) {
		return em.find(Book.class, id);
	}	
	
	
	@SuppressWarnings("unchecked")
	public List<Book> getAll(Pageable page){		
		 return (List<Book>)em.createQuery("select b from Book b")
				 .setFirstResult(page.getPageNumber()*page.getPageSize())
				 .setMaxResults(page.getPageSize()).getResultList();
		}
	
	
	
	public int getSize() {
		return em.createQuery("select count(b) from Book b").getFirstResult();		
	}
	

	public void save(Book book) {
		if(book.getId()==null)
			em.persist(book);
		else 
			em.merge(book);
	}
	public void deleteById(Long  id) {
		em.remove(findById(id));
	}

	@SuppressWarnings("unchecked")
	public List<Book> findAll() {
		return (List<Book>)em.createQuery("select b from Book b").getResultList();	
	}
}
