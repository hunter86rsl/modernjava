package com.apress.bookstore.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.apress.bookstore.model.Author;
import com.apress.bookstore.model.Book;


public class BookExtractor implements ResultSetExtractor<Book> {  
	  
	 public Book extractData(ResultSet resultSet) throws SQLException,  
	   DataAccessException {  
	    
	  Book book = new Book();  
	  Author author = new Author();
	  List<Author> authorList = new ArrayList<Author>();
	  book.setId(resultSet.getLong("id"));
	  book.setBookTitle(resultSet.getString("tytuł_książki"));
	  book.setCategoryId(resultSet.getLong("id_kategorii"));
	  author.setBookId(resultSet.getLong("id_książki"));
	  author.setFirstName(resultSet.getString("imię"));
	  author.setLastName(resultSet.getString("nazwisko"));
	  authorList.add(author);
	  book.setAuthors(authorList);
	  book.setPrice(resultSet.getDouble("cena"));
	  return book;  
	 }  
	  
	}  

