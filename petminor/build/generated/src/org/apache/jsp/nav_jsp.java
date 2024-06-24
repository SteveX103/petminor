package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class nav_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"nav.css\">\n");
      out.write("<nav class=\"navbar\">\n");
      out.write("                <a href=\"front.jsp\">Home</a>\n");
      out.write("                <a href=\"signup.jsp\">Sign up</a>\n");
      out.write("                <a href=\"about us1.html\">About </a>\n");
      out.write("                <ul type=\"none\">\n");
      out.write("                    <li><a href=\"#\" >Service</a>\n");
      out.write("                    <ul type=\"none\" >\n");
      out.write("                        <li><a href=\"#\">Short video</a></li>\n");
      out.write("                        <li><a href=\"booking consultant form.html\">Vet appointment</a></li>\n");
      out.write("                        \n");
      out.write("                    </ul>        \n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <!-- <a href=\"#\">contact us</a> -->\n");
      out.write("                <ul type=\"none\">\n");
      out.write("                <li><a href=\"#\">Shop</a>\n");
      out.write("                <ul type=\"none\">\n");
      out.write("                <li><a href=\"petfood.jsp\">Pet food</a></li>\n");
      out.write("                <li><a href=\"petmed.jsp\">Pet medicine</a></li>\n");
      out.write("                </ul>\n");
      out.write("                </li>\n");
      out.write("               </ul>\n");
      out.write("               <ul type=\"none\">\n");
      out.write("                 <li><a href=\"#\">Login</a>\n");
      out.write("                    <ul type=\"none\">\n");
      out.write("                        \n");
      out.write("                        <li><a href=\"admin.html\">Admin Login</a></li>\n");
      out.write("                        ");
if (session.getAttribute("loggedIn")==null){
      out.write("\n");
      out.write("                        <li><a href=\"login.jsp\">User Login</a></li>\n");
      out.write("                        ");
}
else {


      out.write("<li><a href=\"logout.jsp\">Logout</a></li>");
}
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("               </ul>\n");
      out.write("                    \n");
      out.write("                \n");
      out.write("                </nav>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
