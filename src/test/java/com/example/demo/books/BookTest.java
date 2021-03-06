package com.example.demo.books;

import static org.junit.Assert.*;

import org.junit.Test;

public class BookTest {

	@Test
	public void createBookWithCreationMethod() {
		Book book1 = Book.createHarryPotterOne();
		Book book2 = Book.createHarryPotterTwo();
		
		assertEquals(book1, book2);
	}
	
	//@Test
	public void createBookWithBuilderPattern() {
		Book book1 = new BookBuilder()
				.setName("H1")
				.setPrice(8)
				.build();
		
		Book book2 = new BookBuilder()
				.setName("H1")
				.setPrice(8)
				.build();
		
		assertEquals(book1, book2);
		
	}
	
	@Test
	public void createBookWithConstructor() {
		Book book1 = new Book("H1", 8, 2);
		Book book2 = new Book("H1", 8, 2);
		
		assertEquals(book1, book2);
	}

}
