package com.core.java.day34;

import java.util.ArrayList;
import java.util.List;

public class Library {

	static List<Book> getAllBooks() {
		List<Book> books = new ArrayList<Book>();

		books.add(new Book("My Book", "fiction", 150, 10, "Vaman"));
		books.add(new Book("My Book 2", "scifi", 300, 15, "Raman"));
		books.add(new Book("My Book 3", "fiction", 250, 10, "Saman"));
		books.add(new Book("My Book 4", "history", 300, 15, "Raman"));
		books.add(new Book("My Book 5", "scifi", 500, 15, "Raman"));

		return books;
	}

}