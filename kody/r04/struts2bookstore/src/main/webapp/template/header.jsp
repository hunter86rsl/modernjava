<%@ page language="java" contentType="text/html; charset=ISO-8859-2"
	pageEncoding="ISO-8859-2"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div class="header">
	<h2>
		<span style="margin-left: 15px; margin-top: 15px;" class="label">Ksiêgarnia
			<span style="color: white;">internetowa</span>
		</span>
	</h2>
	<span style="color: black; margin-left: 15px;"> <s:if
			test="%{#session.username != null  && !hasActionErrors() }">Witaj, <s:property
				value="#session.username" /> | <a
				href='<s:url action="logoutLink"/>'>Wyloguj siê</a>
		</s:if> <s:else>
			<a href='<s:url action="loginLink"/>'>Zaloguj siê</a>
		</s:else>

	</span>

</div>