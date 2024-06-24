<%-- 
    Document   : logout
    Created on : Nov 22, 2023, 4:30:58 PM
    Author     : Sayantan Ghosh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="javax.servlet.http.HttpSession"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            //HttpSession session = request.getSession();
	    
	    if (session != null) {
			
		session.invalidate();
                response.sendRedirect("front.jsp");
	    }%>
    </body>
</html>
