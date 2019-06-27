package com.books.books.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.books.books.entity.Writer;

public interface WriterRepository extends JpaRepository<Writer,Long> {

}
