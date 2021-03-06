package com.apress.bookstore.client;

import java.util.List;

import com.apress.bookstore.dao.BookDAO;
import com.apress.bookstore.dao.BookDAOImpl;
import com.apress.bookstore.model.Book;

public class BookApp {
	private static BookDAO bookDAO = new BookDAOImpl();

	public static void main(String[] args) {
		// List all books
		System.out.println("Lista wszystkich ksi��ek:");
		findAllBooks();

		System.out.println("++++++++++++++++++++++++++++++");

		System.out.println("Wyszukiwanie ksi��ek za pomoc� s�owa kluczowego: Java");

		searchBooks("java");

	}

	private static void findAllBooks() {
		List<Book> books = bookDAO.findAllBooks();
		for (Book book : books) {
			System.out.println(book);
		}
	}

	private static void searchBooks(String keyWord) {
		List<Book> books = bookDAO.searchBooksByKeyword(keyWord);
		for (Book book : books) {
			System.out.println(book);
		}
	}
}
