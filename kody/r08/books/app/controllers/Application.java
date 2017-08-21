package controllers;


import play.*;
import play.mvc.*;
import play.data.Form ;
import views.html.*;
import models.*;


public class Application extends Controller {

static Form<Book> bookForm = Form.form(Book.class);
    public static Result index() {
  return redirect(routes.Application.books());
}


 public static Result books() {
    return ok(
    views.html.index.render(Book.all(), bookForm)
  );
}


public static Result newBook() {
    Form<Book> filledForm = bookForm.bindFromRequest();
  if(filledForm.hasErrors()) {
    return badRequest(
      views.html.index.render(Book.all(), filledForm)
    );
  } else {
    Book.create(filledForm.get());
    return redirect(routes.Application.books());  
  }
}
 public static Result deleteBook(Long id) {
  Book.delete(id);
  return redirect(routes.Application.books());
}

}

