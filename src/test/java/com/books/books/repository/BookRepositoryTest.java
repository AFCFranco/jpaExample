package com.books.books.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.books.books.BooksApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes =BooksApplication.class )// the main class that runs the app
public class BookRepositoryTest {
	
	@Test
	public void contextLoads() {
	}

}
