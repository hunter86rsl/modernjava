package com.apress.books.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import com.apress.books.model.Book;
import com.apress.books.service.BookService;
import java.util.List;

@ManagedBean
@RequestScoped
public class BookController {

	  private BookService bookService ;
	  private List<Book> bookList;

    public String listAllBooks() {
	    	bookList = bookService.getAllBooks();
	        return "bookList.xhtml";
	    }
    
    public BookService getBookService() {
  		return bookService;
  	}

  	public void setBookService(BookService bookService) {
  		this.bookService = bookService;
  	}

  	public List<Book> getBookList() {	
  	      return bookList;
  	}
  	public void setBookList(List<Book> bookList) {
  		this.bookList = bookList;
  	}

}