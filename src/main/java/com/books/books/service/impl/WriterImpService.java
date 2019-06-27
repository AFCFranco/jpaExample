package com.books.books.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.books.books.entity.Writer;
import com.books.books.repository.BookRepo;
import com.books.books.repository.WriterRepo;
import com.books.books.repository.WriterRepository;
import com.books.books.service.IWriterService;

@Service
public class WriterImpService implements IWriterService {
	
	
	@Autowired
	WriterRepository wr;

	@Override
	public Writer save(Writer writer) {
		
		wr.save(writer);
		return writer;
	}

	@Override
	public Page<Writer> findAll(Pageable pageable) {
		
		return null;
	}

	@Override
	public List<Writer> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Writer writer) {
		
		// TODO Auto-generated method stub
		
	}

}
