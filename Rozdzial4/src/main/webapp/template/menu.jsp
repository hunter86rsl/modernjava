<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>

<div class="leftbar">
	<ul id="menu">
		<li><div>
				<a class="link1" href="<s:url action="homeLink"/>"><span
					class="label" style="margin-left: 15px;">Strona domowa</span> </a>
			</div></li>
		<li><div>
				<a class="link1" href="<s:url action="allBooksLink"/>"><span
					style="margin-left: 15px;" class="label">Wszystkie książki</span></a>
			</div></li>
		<li><div>

				<span class="label" style="margin-left: 15px;">Kategorie</span>
			</div>
			<ul>

				<li><s:form action="booksByCategoryLink">

						<s:select name="category" list="#session['categoryList']"
							listValue="categoryDescription" listKey="id" />
						<s:submit value="Wybierz" />
					</s:form> <a class="label" href=""><span class="label"
						style="margin-left: 30px;"></span></a></li>

			</ul></li>
		<li><div>
				<span class="label" style="margin-left: 15px;">Kontakt</span>

			</div></li>
	</ul>
	<s:form action="searchByKeywordLink" class="search">
		<s:textfield name="keyword" size="12" />
		<s:submit value="Szukaj" />
	</s:form>
	<span class="tooltip_message">?</span>

</div>