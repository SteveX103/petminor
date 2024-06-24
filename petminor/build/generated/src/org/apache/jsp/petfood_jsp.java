package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class petfood_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>pet food</title>\n");
      out.write("     <link rel=\"stylesheet\" href=\"nav1.css\">\n");
      out.write("    <style>\n");
      out.write("        *{\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("        }\n");
      out.write("        #shop{\n");
      out.write("            display: flex;\n");
      out.write("            border: 1.5px solid rgb(41, 196, 247);\n");
      out.write("            border-radius: 30px;\n");
      out.write("            width: fit-content;\n");
      out.write("            height: fit-content;\n");
      out.write("            margin: auto;\n");
      out.write("            margin-top: 15%;\n");
      out.write("            background-color: aliceblue;\n");
      out.write("        }\n");
      out.write("        .food{\n");
      out.write("            height: 200px;\n");
      out.write("            width: 200px;\n");
      out.write("            border: 2px solid black;\n");
      out.write("            padding: 30px;\n");
      out.write("            margin: 20px;\n");
      out.write("            border-radius: 30px;\n");
      out.write("        }\n");
      out.write("        .food:hover{\n");
      out.write("            background-color: rgb(41, 196, 247);\n");
      out.write("            font-size: 1.3rem;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("        .food h1{\n");
      out.write("            text-align: center;\n");
      out.write("            padding: 50px;  \n");
      out.write("        }\n");
      out.write("        .food h1 a{\n");
      out.write("            text-decoration: none;\n");
      out.write("        }\n");
      out.write("        @keyframes san1{\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "nav.jsp", out, false);
      out.write("\n");
      out.write("    <div id=\"shop\">\n");
      out.write("        <div class=\"food\">\n");
      out.write("            <h1><a href=\"dfood.jsp\">DOG FOOD</a></h1>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"food\">\n");
      out.write("            <h1><a href=\"cfood.jsp\">CAT FOOD</a></h1>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
