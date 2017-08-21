package books

class Author {

    static hasMany = [books:Book]
    String firstName
	String lastName
	static constraints = {
		firstName(blank:false)
		lastName(blank:false)
		}
	String toString() {
		"$lastName, $firstName"
		}
}