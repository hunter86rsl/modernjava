package books

class Book {

    static belongsTo = Author
    static hasMany = [authors:Author]
    String title
	Long isbn
	String publisher
	static constraints = {
		title(blank:false)
		}
	
	String toString() {
		title
		}
}
 