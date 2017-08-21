package models;

import java.util.*;
import play.db.ebean.*;
import play.data.validation.Constraints.*;

import javax.persistence.*;

@Entity
public class Book extends Model {
  @Id
  public Long id;
  @Required
  public String label;

public static Finder<Long,Book> find = new Finder(
    Long.class, Book.class
  );
  

public static List<Book> all() {
  return find.all();
}

public static void create(Book book) {
  book.save();
}
public static void update(Long id, Book book) {
    book.update(id); 
}

public static void delete(Long id) {
  find.ref(id).delete();
}
   
 
}
