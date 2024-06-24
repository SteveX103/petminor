package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleConnection;

public final class newpass_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


            String vemail, vpass;
            OracleConnection oconn;
            OraclePreparedStatement ost;
            HttpSession sess;
          
            
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Password Reset Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-image: url('../Images/Screen/img101.png')\">\n");
      out.write("         ");
      out.write("\n");
      out.write("            ");

            if(request.getParameter("bConfirm")!=null)
            {
                if(request.getParameter("tpass").equals(request.getParameter("cpass")))
                {
                   sess = request.getSession(false);
                   vpass = request.getParameter("tpass");
                   vemail = sess.getAttribute("sessemail").toString();
                   DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
                   oconn = (OracleConnection)DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-NC8LD89:1522:orcle","PETMINOR","DATABASE");
                   ost =(OraclePreparedStatement) oconn.prepareStatement("update signup set  PASSWORD=? where EMAIL=?");
                   ost.setString(1, vpass);
                   ost.setString(2, vemail);
                   int x = ost.executeUpdate();
                   ost.close();
                   oconn.close();
                   sess.invalidate();
                     
      out.write("\n");
      out.write("                    <script>\n");
      out.write("                    alert(\"Password reset successfully!!! You can now login using your new password\");\n");
      out.write("                    alert(\"Redirecting for logging==>>\");\n");
      out.write("                    location.href=\"http://localhost:8080/petminor/login.html\";\n");
      out.write("                </script>\n");
      out.write("                ");
  
                }
                else
                {
                       
      out.write(" \n");
      out.write("                       <h3 style=\"color:red\">Password do not match!!!. Please try again!!!</h3>                 \n");
      out.write("                        ");

                }
            }
            else
            {
                   vemail = request.getParameter("pemail");
                   sess = request.getSession(true);
                   sess.setAttribute("sessemail", vemail);
                   
      out.write("\n");
      out.write("                   <h3 style=\"color: blueviolet\">\n");
      out.write("                   Please verify your security credentials.\n");
      out.write("                   </h3>\n");
      out.write("                    ");

                   
            }   
            
      out.write("\n");
      out.write("        <form>\n");
      out.write("        <div>\n");
      out.write("            <br/><br/><br/><br/>\n");
      out.write("            <table border=\"1\" style=\"font-size: 100%; color:whitesmoke; background-color: black\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr><th colspan=\"2\">RESET YOUR PASSWORD</th></tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>NEW PASSWORD</td>\n");
      out.write("                        <td><input type=\"password\" name=\"tpass\" id=\"tpass\" required></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>CONFIRM PASSWORD</td>\n");
      out.write("                        <td><input type=\"password\" name=\"cpass\" id=\"cpass\" required></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr><td><button type=\"submit\" style=\"font-size: 50%\" name=\"bConfirm\">Confirm</button></td>\n");
      out.write("                        <td>\n");
      out.write("                            <button type=\"reset\" style=\"font-size: 50%\" name=\"bClear\">Clear</button>\n");
      out.write("                        </td>\n");
      out.write("                </tbody>\n");
      out.write("                <tfoot>\n");
      out.write("                    <th  colspan=\"2\"> &copy; TECHNO INDIA TECHNOLOGIES &reg;</th>\n");
      out.write("                </tfoot>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("            </form>\n");
      out.write("    </body>\n");
      out.write("</html> \n");
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
