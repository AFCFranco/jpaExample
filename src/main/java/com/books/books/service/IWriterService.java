package com.books.books.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.books.books.entity.Writer;

public interface IWriterService {
	public Writer save(Writer writer);
	public Page<Writer> findAll(Pageable pageable);
	public List<Writer> findAll();
	public void delete(Writer writer);

}
