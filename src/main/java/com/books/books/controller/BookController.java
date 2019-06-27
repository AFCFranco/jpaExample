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
import com.books.books.service.IBookService;
import com.books.books.service.impl.BookImpService;
import io.swagger.annotations.ApiOperation;



@CrossOrigin("*") //para que no rechace lo que llegue de una ip deferente
@RestController
@RequestMapping(path = "book")
public class BookController {	
	@Autowired
	IBookService bookService;
	
	@GetMapping("proof")
	@ApiOperation(value = "Recuperar todos libros", notes = "Recuperar los libros por paginas")
	public ResponseEntity<Page<Book>> getAll(@RequestParam("page") int page)  {
		PageRequest pageable = PageRequest.of(page - 1, 1);
		return ResponseEntity.ok(bookService.findAll(pageable));				
	}	
	@PostMapping("save")
	@ApiOperation(value = "Guarda un Libro", notes = "Guarda un Libro")
	public ResponseEntity<Book> save(Book book){
		return ResponseEntity.ok(bookService.save(book));
	}
	

	@DeleteMapping("delete")
	@ApiOperation(value = "Elimina un Libro", notes = "Elimina un Libro")
	public void delete(Book book){
		bookService.delete(book);
	}
	
}
