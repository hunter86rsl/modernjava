/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.81
 * Generated at: 2017-08-27 12:42:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import com.apress.bookweb.model.Book;
import com.apress.bookweb.model.Category;

public final class leftColumn_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-2");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	String param1 = application.getInitParameter("param1");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bookstore.css\" type=\"text/css\" />\r\n");
      out.write("<script src=\"js/bookstore.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.9.1.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<div class=\"leftbar\">\r\n");
      out.write("\t<ul id=\"menu\">\r\n");
      out.write("\t\t<li><div>\r\n");
      out.write("\t\t\t\t<a class=\"link1\" href=\"");
      out.print(param1);
      out.write("\"> <span class=\"label\"\r\n");
      out.write("\t\t\t\t\tstyle=\"margin-left: 15px;\">Strona domowa</span>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</div></li>\r\n");
      out.write("\t\t<li><div>\r\n");
      out.write("\t\t\t\t<a class=\"link1\" href=\"");
      out.print(param1);
      out.write("?action=allBooks\"><span\r\n");
      out.write("\t\t\t\t\tstyle=\"margin-left: 15px;\" class=\"label\">Wszystkie książki</span></a>\r\n");
      out.write("\t\t\t</div></li>\r\n");
      out.write("\t\t<li><div>\r\n");
      out.write("\t\t\t\t<span class=\"label\" style=\"margin-left: 15px;\">Kategorie</span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t");

					List<Category> categoryList1 = (List<Category>) application
							.getAttribute("categoryList");
					Iterator<Category> iterator1 = categoryList1.iterator();
					while (iterator1.hasNext()) {
						Category category1 = (Category) iterator1.next();
				
      out.write("\r\n");
      out.write("\t\t\t\t<li><a class=\"label\"\r\n");
      out.write("\t\t\t\t\thref=\"");
      out.print(param1);
      out.write("?action=category&categoryId=");
      out.print(category1.getId());
      out.write("&category=");
      out.print(category1.getCategoryDescription());
      out.write("\"><span\r\n");
      out.write("\t\t\t\t\t\tclass=\"label\" style=\"margin-left: 30px;\">");
      out.print(category1.getCategoryDescription());
      out.write("</span></a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t");

					}
				
      out.write("\r\n");
      out.write("\t\t\t</ul></li>\r\n");
      out.write("\t\t<li><div>\r\n");
      out.write("\t\t\t\t<span class=\"label\" style=\"margin-left: 15px;\">Kontakt</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div></li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t<form class=\"search\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"action\" value=\"search\" /> <input id=\"text\"\r\n");
      out.write("\t\t\ttype=\"text\" name=\"keyWord\" size=\"12\" /> <span\r\n");
      out.write("\t\t\tclass=\"tooltip_message\">?</span>\r\n");
      out.write("\t\t<p />\r\n");
      out.write("\t\t<input id=\"submit\" type=\"submit\" value=\"Szukaj\" />\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}