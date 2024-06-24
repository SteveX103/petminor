package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>login page</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"nav1.css\">\n");
      out.write("         <style>\n");
      out.write("        *{\n");
      out.write("            margin: 0px;\n");
      out.write("            padding: 0px;\n");
      out.write("        }\n");
      out.write("        form{\n");
      out.write("            /* border: 1.5px solid rgb(41, 196, 247); */\n");
      out.write("            box-shadow: 0px 0px 10px 5px rgb(41, 196, 247);\n");
      out.write("            border-radius: 20px;\n");
      out.write("            /* margin: auto; */\n");
      out.write("            width: fit-content;\n");
      out.write("            height: fit-content;\n");
      out.write("            padding: 15px;\n");
      out.write("            margin-left: 7%;\n");
      out.write("            margin-top: 5%\n");
      out.write("            /* margin-top: 10%; */\n");
      out.write("        }\n");
      out.write("        h1{\n");
      out.write("            /* border: 1.5px solid rgb(41, 196, 247); */\n");
      out.write("            text-align: center;\n");
      out.write("            margin: 5px;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        label{\n");
      out.write("            font-size: larger;\n");
      out.write("        }\n");
      out.write("        input{\n");
      out.write("            border-radius: 10px;\n");
      out.write("            height: 30px;\n");
      out.write("            padding: 5px;\n");
      out.write("            font-size: medium;\n");
      out.write("        }\n");
      out.write("        button{\n");
      out.write("            width: 200px;\n");
      out.write("            height: 30px;\n");
      out.write("            line-height: 10px;\n");
      out.write("            padding: 10px;\n");
      out.write("            text-align: center;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            margin-left: 18%;\n");
      out.write("        }\n");
      out.write("        button:hover{\n");
      out.write("            cursor: pointer;\n");
      out.write("            background-color:rgb(162, 222, 241);\n");
      out.write("            font-size: large;\n");
      out.write("        }\n");
      out.write("        div{\n");
      out.write("            margin: 5px;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            padding: 5px;\n");
      out.write("        }\n");
      out.write("        form span{\n");
      out.write("            position: absolute;\n");
      out.write("            margin-left: 17%;\n");
      out.write("            font-size: larger;\n");
      out.write("        }\n");
      out.write("        form span:hover{\n");
      out.write("            height: 30px;\n");
      out.write("            width: 30px;\n");
      out.write("            border-radius: 130px;\n");
      out.write("            background-color: rgb(41, 196, 247);\n");
      out.write("            line-height: 30px;\n");
      out.write("            text-align: center;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("/*        form p{\n");
      out.write("            float:right;\n");
      out.write("        }*/\n");
      out.write("        form p a{\n");
      out.write("            text-decoration: none;\n");
      out.write("            color:black;\n");
      out.write("            font-size: 14px;\n");
      out.write("        }\n");
      out.write("        form p a:hover{\n");
      out.write("            text-decoration: underline;\n");
      out.write("            color:rgb(18, 123, 235);\n");
      out.write("/*            font-size: 15px;*/\n");
      out.write("        }\n");
      out.write("        form #new{\n");
      out.write("/*            float:left;*/\n");
      out.write("              margin-left:13%;\n");
      out.write("              font-size: 14px;\n");
      out.write("        }\n");
      out.write("        .san{\n");
      out.write("            display:flex;\n");
      out.write("        }\n");
      out.write("        body{\n");
      out.write("            display: flex;\n");
      out.write("            margin-top: 10%;\n");
      out.write("            background-image:url('signbg.avif');\n");
      out.write("            background-repeat:no-repeat;\n");
      out.write("            background-size:100vw;\n");
      out.write("        }\n");
      out.write("        .kal{\n");
      out.write("            background-image: url('anipet2.png');\n");
      out.write("            margin-left: 7%;\n");
      out.write("            width: 400px;\n");
      out.write("            height: 500px;\n");
      out.write("            background-size: 400px;\n");
      out.write("            background-repeat: no-repeat;\n");
      out.write("            animation-name: san1;\n");
      out.write("            animation-duration: 5s;\n");
      out.write("            animation-fill-mode: both;\n");
      out.write("            animation-iteration-count: infinite;\n");
      out.write("        }\n");
      out.write("        @keyframes san1 {\n");
      out.write("            0%{\n");
      out.write("                background-image: url('anipet2.png');\n");
      out.write("            }\n");
      out.write("            50%{\n");
      out.write("                background-image: url('anipet1.png');\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "nav.jsp", out, false);
      out.write("\n");
      out.write("          <div class=\"kal\">\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <form action=\"http://localhost:8080/petminor/login\" method=\"post\">\n");
      out.write("        <span><b>&times;</b></span>\n");
      out.write("        <h1>login</h1><br>\n");
      out.write("         <label for=\"email\">email</label>&nbsp;&nbsp;\n");
      out.write("        <input type=\"email\" id=\"email\" name=\"email\" placeholder=\"enter your email..\" required><br><br>\n");
      out.write("        <div id=\"msg_email\"></div>\n");
      out.write("        <label for=\"password\">password</label>&nbsp;&nbsp;\n");
      out.write("        <input type=\"password\" id=\"password\" name=\"password\" oninput=\"validate_password()\" placeholder=\"enter your password..\" required><br><br>\n");
      out.write("        \n");
      out.write("        <button type=\"submit\" onclick=\"validate_button()\">login</button><br>\n");
      out.write("        <div id=\"msg_bttn\"></div>\n");
      out.write("        <div class=\"san\">\n");
      out.write("            <p><a href=\"http://localhost:8080/petminor/forgot.html\"><b>forgot password??</b></a></p><br><br>\n");
      out.write("            <p id=\"new\"><b>New User???<a href=\"signup.html\">sign up</b></a></p>\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
