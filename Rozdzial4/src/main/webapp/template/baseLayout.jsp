<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/bookstore.css" type="text/css" />
<script type="text/javascript" src="js/jquery-1.9.1.js"></script>
<script src="js/bookstore.js" charset="UTF-8"></script>
<title><tiles:insertAttribute name="title" ignore="true" /></title>
</head>
<body>
	<div id="centered">

		<tiles:insertAttribute name="header" />

		<tiles:insertAttribute name="menu" />

		<tiles:insertAttribute name="body" />

	</div>
</body>
</html>
