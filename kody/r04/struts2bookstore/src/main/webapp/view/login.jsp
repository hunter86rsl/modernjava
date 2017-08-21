<%@ page contentType="text/html; charset=ISO-8859-2" pageEncoding="ISO-8859-2"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-2">
<title>Strona logowania do księgarni</title>
</head>

<body>
	<h3>Logowanie do księgarni</h3>
	<s:form action="executeloginLink" method="post">
		<s:textfield name="username" key="label.username" size="30" />
		<s:password name="password" key="label.password" size="30" />
		<s:submit value="Wylij" method="executeLogin" align="center" />
	</s:form>
</body>
</html>