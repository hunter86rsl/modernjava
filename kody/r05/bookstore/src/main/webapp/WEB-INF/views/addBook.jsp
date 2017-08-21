<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Twoja księgarnia</title>
         <style>
            .error {
                color: red;
            }
        </style> 
    </head>
    <body>
        <h1>Dodaj książkę</h1>
	<form:form method="post" commandName="book">
            Autor<br />
            <form:select path="author">
                <form:options items="${authorList}" itemValue="authorId" itemLabel="authorName" />
            </form:select>
            <br /><br />
            Nazwa książki<br />
            <form:errors path="bookTitle"    cssClass="error" /><br />
            <form:input path="bookTitle"/><br /><br />
            <br />
            <input type="submit" value="Wyślij">
	</form:form>
    </body>
</html>
