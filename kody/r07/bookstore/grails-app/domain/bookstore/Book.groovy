package bookstore

class Book {
	String bookTitle
	Long price
	Long isbn

	static constraints = {
		bookTitle(blank:false)
		price(blank:false)
	}
	String toString() {
		bookTitle
	}
}
