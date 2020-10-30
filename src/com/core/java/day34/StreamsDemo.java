package com.core.java.day34;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {

	public static void main(String[] args) {

		List<Book> myBooks = Library.getAllBooks();
//		System.out.println(myBooks);

		// get books collection -> convert to stream -> filter based on condition,
		// collect the required books -> convert stream to collection
		List<Book> booksLessThan200 = Library.getAllBooks().stream().filter(book -> book.price >= 300)
				.collect(Collectors.toList());

		// print filtered books
		booksLessThan200.stream().map(Book::toString).forEach(System.out::println);

	}

}
