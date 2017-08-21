
<%@ page import="bookstore.Book" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'book.label', default: 'Książka')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-book" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Przejdź do treści&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-book" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list book">
			
				<g:if test="${bookInstance?.bookTitle}">
				<li class="fieldcontain">
					<span id="bookTitle-label" class="property-label"><g:message code="book.bookTitle.label" default="Tytuł książki" /></span>
					
						<span class="property-value" aria-labelledby="bookTitle-label"><g:fieldValue bean="${bookInstance}" field="bookTitle"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${bookInstance?.price}">
				<li class="fieldcontain">
					<span id="price-label" class="property-label"><g:message code="book.price.label" default="Cena" /></span>
					
						<span class="property-value" aria-labelledby="price-label"><g:fieldValue bean="${bookInstance}" field="price"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${bookInstance?.isbn}">
				<li class="fieldcontain">
					<span id="isbn-label" class="property-label"><g:message code="book.isbn.label" default="ISBN" /></span>
					
						<span class="property-value" aria-labelledby="isbn-label"><g:fieldValue bean="${bookInstance}" field="isbn"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form>
				<fieldset class="buttons">
					<g:hiddenField name="id" value="${bookInstance?.id}" />
					<g:link class="edit" action="edit" id="${bookInstance?.id}"><g:message code="default.button.edit.label" default="Edytuj" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Usuń')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Czy jesteś pewien?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
