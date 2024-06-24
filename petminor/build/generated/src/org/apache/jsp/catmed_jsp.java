package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSetMetaData;
import oracle.jdbc.OracleResultSet;
import oracle.jdbc.OracleConnection;

public final class catmed_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Record signup</title>\n");
      out.write("        <!--STEP 2: ADDING A INTERNAL STYLE FOR TABLE-->\n");
      out.write("         <style>\n");
      out.write("                table, tr, td\n");
      out.write("                {\n");
      out.write("                    padding: 10px;\n");
      out.write("                    border: 3px solid rgb(41, 196, 247);\n");
      out.write("                    border-collapse: collapse\n");
      out.write("                }\n");
      out.write("                th\n");
      out.write("                {\n");
      out.write("                    padding: 10px;\n");
      out.write("                    border: 3px solid rgb(41, 196, 247);\n");
      out.write("                    border-collapse: collapse;\n");
      out.write("                    color: black;\n");
      out.write("                }\n");
      out.write("            </style>\n");
      out.write("    </head>\n");
      out.write(" \n");
      out.write("    <body>\n");
      out.write("        ");

            ArrayList<HashMap> arr = new ArrayList<>();
            
            try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-NC8LD89:1522:orcle", "petminor", "database");
			
			try {
				String sql = "select * from catmed1";
				PreparedStatement pstm = con.prepareStatement(sql);
				ResultSet rs = pstm.executeQuery();
				
				while(rs.next()) {
                                    HashMap<String, String> hm = new HashMap<>();
                                    
                                    hm.put("id", rs.getString("med_id"));
                                    hm.put("name", rs.getString("med_name"));
                                    hm.put("quantity", rs.getString("quantity"));
                                    
                                    arr.add(hm);
                                }
			}
			finally {
				con.close();
			}
		}
		catch(Exception e) {
			System.out.println("Exception: " + e);
		}
        
      out.write("\n");
      out.write("        <!--STEP 1: BASIC STRUCTURE OF A TABLE-->\n");
      out.write("        <table>\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    \n");
      out.write("                        <th>Med_id</th>\n");
      out.write("                        <th>Med_name</th>\n");
      out.write("                        <th>Quantity</th>\n");
      out.write("                        \n");
      out.write("                     <th>ACTION</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");

                    for(int i=0;i<arr.size();i++) {
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    \n");
      out.write("                    <th>");
out.print(arr.get(i).get("id"));
      out.write("</th>\n");
      out.write("                    <th>");
out.print(arr.get(i).get("name"));
      out.write("</th>\n");
      out.write("                    <th>");
out.print(arr.get(i).get("quantity"));
      out.write("</th>\n");
      out.write("                        \n");
      out.write("                    <td>\n");
      out.write("                        \n");
      out.write("<!--                        <button>Edit</button>-->\n");
      out.write("                        \n");
      out.write("                        <form action=\"http://localhost:8080/petminor/delete\" method=\"post\">\n");
      out.write("                            <input type=\"hidden\" value=\"");
out.print(arr.get(i).get("id"));
      out.write("\" name=\"id\">\n");
      out.write("                        <button type=\"submit\">Delete</button>\n");
      out.write("                        </form>\n");
      out.write("                        </td>\n");
      out.write("                </tr>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("                \n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("                    \n");
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
