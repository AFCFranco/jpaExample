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

@Repository
@Transactional
public class WriterRepo {
	@Autowired
	EntityManager em;
	public Writer findById(Long id) {
		return em.find(Writer.class, id);
	}
	public void save(Writer writer) {
		if (writer.getId() == null)
			em.persist(writer);
		else
			em.merge(writer);
	}
	public void deleteById(Long id) {
		em.remove(findById(id));
	}
//	public void addBook(Long wiriterId, Long bookId) {
//		Writer wr = em.find(Writer.class, wiriterId);
//		Book bk = em.find(Book.class, bookId);
//		wr.addBook(bk);
//	}
//
//	public void printBooks(Long writerId) {
//		Writer w2 = findById(writerId);
//		List<Book> books = w2.getBooks();
//		books.forEach(b -> System.out.println(b.getTitle()));
//	}

	@SuppressWarnings("unchecked")
	public List<Writer> findAll() {
		return (List<Writer>) em.createQuery("select b from Writer b").getResultList();
	}

	@SuppressWarnings("unchecked")
	public Page<Writer> getAll(Pageable page) {
		return (Page<Writer>) em.createQuery("select b from Writer b")
				.setFirstResult(page.getPageNumber() * page.getPageSize()).setMaxResults(page.getPageSize())
				.getResultList();
	}
}
