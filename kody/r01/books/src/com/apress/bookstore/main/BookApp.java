package com.apress.bookstore.main;

import java.util.List;
import com.apress.bookstore.model.Book;
import com.apress.bookstore.service.BookService;
import com.apress.bookstore.service.BookServiceImpl;

public class BookApp {
	private static BookService bookService = new BookServiceImpl();

	public static void main(String[] args) {
		// List all books
		System.out.println("Lista wszystkich książek:");
		findAllBooks();

		System.out.println("++++++++++++++++++++++++++++++");

		System.out.println("Wyszukiwanie książek za pomocą słowa kluczowego: Java");

		searchBooksByKeyword("java");

	}

	private static void findAllBooks() {
		List<Book> books = bookService.findAll();
		for (Book book : books) {
			System.out.println(book);
		}
	}

	private static void searchBooksByKeyword(String keyWord) {
		List<Book> books = bookService.searchBooksByKeyword(keyWord);
		for (Book book : books) {
			System.out.println(book);
		}
	}

}