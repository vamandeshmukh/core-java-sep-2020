package com.core.java.day34;

public class Book {

	String name;
	String category;
	double price;
	double discountPercentage;
	String author;

	public Book() {
		super();
	}
	
	public double getPrice() {
		return this.price;
	}

	public Book(String name, String category, double price, double discountPercentage, String author) {
		super();
		this.name = name;
		this.category = category;
		this.price = price;
		this.discountPercentage = discountPercentage;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", category=" + category + ", price=" + price + ", discountPercentage="
				+ discountPercentage + ", author=" + author + "]";
	}

}