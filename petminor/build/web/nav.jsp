<%-- 
    Document   : nav
    Created on : Nov 21, 2023, 4:50:59 PM
    Author     : Sayantan Ghosh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="nav.css">
<nav class="navbar">
                <a href="front.jsp">Home</a>
                <a href="signup.jsp">Sign up</a>
                <a href="about us1.html">About </a>
                <ul type="none">
                    <li><a href="#" >Service</a>
                    <ul type="none" >
                        <li><a href="#">Short video</a></li>
                        <li><a href="booking consultant form.html">Vet appointment</a></li>
                        
                    </ul>        
                    </li>
                </ul>
                <!-- <a href="#">contact us</a> -->
                <ul type="none">
                <li><a href="#">Shop</a>
                <ul type="none">
                <li><a href="petfood.jsp">Pet food</a></li>
                <li><a href="petmed.jsp">Pet medicine</a></li>
                </ul>
                </li>
               </ul>
               <ul type="none">
                 <li><a href="#">Login</a>
                    <ul type="none">
                        
                        <li><a href="admin.html">Admin Login</a></li>
                        <%if (session.getAttribute("loggedIn")==null){%>
                        <li><a href="login.jsp">User Login</a></li>
                        <%}
else {

%><li><a href="logout.jsp">Logout</a></li><%}%>
                    </ul>
                </li>
               </ul>
                    
                
                </nav>
