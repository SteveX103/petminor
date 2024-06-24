<%-- 
    Document   : profile
    Created on : Nov 23, 2023, 2:03:24 PM
    Author     : Sayantan Ghosh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String email = request.getParameter("email");
            
                try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-NC8LD89:1522:orcle", "petminor", "database")) {
				String sql = "select * from signup where email=?";
				PreparedStatement pstm = con.prepareStatement(sql);
				pstm.setString(1, email);
				ResultSet rs = pstm.executeQuery();
                                
                                HashMap<String, String> hm = new HashMap<>();
                                
                                if(rs.next()) {
                                    hm.put("name", rs.getString("name"));
                                    hm.put("email", rs.getString("email"));
                                    hm.put("phone", rs.getString("phonr_no"));
                                }
				
                                request.setAttribute("profile", hm);
				request.getRequestDispatcher("profile2.jsp").forward(request, response);
			}
		}
		catch(Exception e) {
			response.sendRedirect("profile2.jsp");
		}
        %>
    </body>
</html>
