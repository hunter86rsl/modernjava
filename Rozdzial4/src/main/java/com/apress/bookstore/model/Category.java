package com.apress.bookstore.model;

public class Category {
	private Long id;
	private String categoryDescription;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategoryDescription() {
		return categoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}

	public String toString() {
		return "Kategoria - identyfikator: " + id + ", Opis kategorii: "
				+ categoryDescription;
	}

}
