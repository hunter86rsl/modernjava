package com.apress.books.client;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.apress.books.model.Book;
import com.apress.books.service.BookService;

public class BookApp {

	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		 BookService bookService = (BookService)context.getBean("service");
		// Wyświetlanie listy wszystkich książek
		System.err.println("Lista wszystkich książek:");
		List<Book> bookList= bookService.getAllBooks();
		for(Book b: bookList){
			System.out.println(b.getId()+"--"+b.getBookTitle());

		}
		// wyszukiwanie książek za pomocą słów kluczowych
		System.err.println("Wyszukiwanie książek za pomocą słów kluczowych w tytule : Groovy:");

		//searchBooks("Groovy");
		System.out.println();

		System.err.println("Wyszukiwanie książek za pomocą słów kluczowych w imionach autorów : Josh:");

		//searchBooks("Josh");
		

	}

	/*	private static void searchBooks(String keyWord) {
		List<Book> books = bookDao.searchBooksByKeyword(keyWord);
		for (Book book : books) {
			System.out.println(book);
		}
	}*/
}