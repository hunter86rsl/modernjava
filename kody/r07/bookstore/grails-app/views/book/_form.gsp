<%@ page import="bookstore.Book" %>



<div class="fieldcontain ${hasErrors(bean: bookInstance, field: 'bookTitle', 'error')} required">
	<label for="bookTitle">
		<g:message code="book.bookTitle.label" default="Tytuł książki" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="bookTitle" required="" value="${bookInstance?.bookTitle}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: bookInstance, field: 'price', 'error')} required">
	<label for="price">
		<g:message code="book.price.label" default="Cena" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="price" type="number" value="${bookInstance.price}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: bookInstance, field: 'isbn', 'error')} required">
	<label for="isbn">
		<g:message code="book.isbn.label" default="ISBN" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="isbn" type="number" value="${bookInstance.isbn}" required=""/>
</div>

