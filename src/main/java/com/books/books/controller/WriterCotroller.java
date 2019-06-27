package com.books.books.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.books.books.entity.Book;
import com.books.books.entity.Writer;
import com.books.books.service.IBookService;
import com.books.books.service.IWriterService;

import io.swagger.annotations.ApiOperation;

@CrossOrigin("*") //para que no rechace lo que llegue de una ip deferente
@RestController
@RequestMapping(path = "writer")
public class WriterCotroller {
	@Autowired
	IWriterService writerService;
	
	@GetMapping("proof")
	@ApiOperation(value = "Recuperar todos escritores", notes = "Recuperar los escritores por paginas")
	public ResponseEntity<Page<Writer>> getAll(@RequestParam("page") int page)  {
		PageRequest pageable = PageRequest.of(page - 1, 10);
		return ResponseEntity.ok(writerService.findAll(pageable));				
	}	
	@PostMapping("save")
	@ApiOperation(value = "Guarda un Escritor", notes = "Guarda un Escritor")
	public ResponseEntity<Writer> save(Writer writer){
		return ResponseEntity.ok(writerService.save(writer));
	}
	

	@DeleteMapping("delete")
	@ApiOperation(value = "Elimina un escritor", notes = "Elimina un escritor")
	public void delete(Writer writer){
		writerService.delete(writer);
	}
	
	

}
