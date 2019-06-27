package com.books.books.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.books.books.entity.Book;

public interface BookRepository extends JpaRepository<Book,Long>{//el long es el tipo de dato del id

}

