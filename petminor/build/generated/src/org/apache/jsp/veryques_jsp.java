package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jdbc.OracleResultSet;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleConnection;
import java.sql.DriverManager;

public final class veryques_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


            String vemail, vques, vans;
            OracleConnection oconn;
          OraclePreparedStatement ost;
          OracleResultSet ors = null;
            
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script>\n");
      out.write("            function funClose()\n");
      out.write("            {\n");
      out.write("                if(window.parent) if(confirm(\"Closing window......\") === true)  window.parent.window.close();    \n");
      out.write("                else if(confirm(\"Closing window......\") === true) window.close();   \n");
      out.write("              }\n");
      out.write("         </script>     \n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: antiquewhite\">\n");
      out.write("         ");
      out.write("\n");
      out.write("        ");

            vemail = request.getParameter("pemail");
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            oconn = (OracleConnection)DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-NC8LD89:1522:orcle","PETMINOR","DATABASE");
           ost =(OraclePreparedStatement) oconn.prepareStatement("SELECT * FROM signup where email=?");
            ost.setString(1, vemail);
            ors = (OracleResultSet) ost.executeQuery();
            if(ors.next()) 
            {
                vques = ors.getString("very_ques"); //SQUES IS D COL NAME FOR SECURITY QUES IN UR DB
                vans = ors.getString("very_ans");
            }
            else
            {
                 
      out.write("\n");
      out.write("                <script>\n");
      out.write("                    alert(\"Do not try any malaligned URL. \\n You can only use  the link received in mail \");\n");
      out.write("                    window.close();\n");
      out.write("                </script>\n");
      out.write("                ");

            }
            ost.close();
            oconn.close();
            if(request.getParameter("bVerify")!=null)
            {
                if(request.getParameter("tbAns").equals(vans))
                {
                
      out.write("\n");
      out.write("                <script>\n");
      out.write("                    alert(\"Security Answer verified successfully!!!\");\n");
      out.write("                    location.href=\"http://localhost:8080/petminor/veryques.jsp?pemail=");
      out.print(vemail);
      out.write("\";\n");
      out.write("                </script>\n");
      out.write("                ");

                }
                else
                {
                       
      out.write(" \n");
      out.write("                       <h3 style=\"color:red\">Wrong Answer. Please try again!!!</h3>                 \n");
      out.write("                        ");

                }
            }
            else
            {
                   
      out.write("\n");
      out.write("                   \n");
      out.write("                   <h3 style=\"color: blueviolet\">\n");
      out.write("                   Please verify your security credentials.\n");
      out.write("                    <h3>\n");
      out.write("                    ");

            }   
            
      out.write(" \n");
      out.write("        <h2>THIS IS SECURITY QUESTION AND ANSWER VERIFICATION PAGE!</h2>\n");
      out.write("        <form name=\"frmSecurity\" method=\"POST\" action=\"http://localhost:8080/petminor/newpass.jsp?pemail=");
      out.print(vemail);
      out.write("\">\n");
      out.write("        <div>\n");
      out.write("            <table border=\"1\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr><th colspan=\"2\">SECURITY VERIFICATION FORM</th></tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>QUESTION</td>\n");
      out.write("                        <td><input type=\"text\" size=\"30\" name=\"tbQues\" value=\"");
      out.print(vques);
      out.write("\" readonly /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>ANSWER</td>\n");
      out.write("                        <td><input type=\"text\" size=\"30\" name=\"tbAns\" required/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <button type=\"submit\" name=\"bVerify\">Verify</button>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <button type=\"reset\" name=\"bReset\">Reset</button>\n");
      out.write("                            <button type=\"button\" name=\"bClose\" onclick=\"funClose();\">Close</button>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("                <tfoot>\n");
      out.write("                    <tr><th colspan=\"2\">&copy;Techno India Technologies ; Limited &reg;</th></tr>\n");
      out.write("                </tfoot>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("            </form>\n");
      out.write("    </body>\n");
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
