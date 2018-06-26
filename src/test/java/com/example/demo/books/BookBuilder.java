package com.example.demo.books;

public class BookBuilder {
	private String name;
	private int price;
	
	public BookBuilder setName(String name) {
		this.name = name;
		return this;
	}

	public BookBuilder setPrice(int price) {
		this.setPrice(price);
		return this;
	}
	
	public Book build() {
		return new Book(this.name, this.price, 1);
	}
}
