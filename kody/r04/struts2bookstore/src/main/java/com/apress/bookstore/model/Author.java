package com.apress.bookstore.model;

public class Author {
	private Long id;
	private Long bookId;
	private String firstName;
	private String lastName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String toString() {
		return "Autor - identyfikator: " + id + ", Identyfikator książki: " + bookId + ", Imię: "
				+ firstName + ", Nazwisko: " + lastName;
	}

}
