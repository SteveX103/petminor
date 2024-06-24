<%-- 
    Document   : signup
    Created on : Nov 1, 2023, 9:08:50 PM
    Author     : Sayantan Ghosh
--%>

<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="oracle.jdbc.OraclePreparedStatement"%>
<%@page import="oracle.jdbc.OracleResultSetMetaData"%>
<%@page import="oracle.jdbc.OracleResultSet"%>
<%@page import="oracle.jdbc.OracleConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Record signup</title>
        <!--STEP 2: ADDING A INTERNAL STYLE FOR TABLE-->
         <style>
                table, tr, td
                {
                    padding: 10px;
                    border: 3px solid rgb(41, 196, 247);
                    border-collapse: collapse
                }
                th
                {
                    padding: 10px;
                    border: 3px solid rgb(41, 196, 247);
                    border-collapse: collapse;
                    color: black;
                }
            </style>
    </head>
 
    <body>
        <%
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
        %>
        <!--STEP 1: BASIC STRUCTURE OF A TABLE-->
        <table>
            <thead>
                <tr>
                    
                        <th>Med_id</th>
                        <th>Med_name</th>
                        <th>Quantity</th>
                        
                     <th>ACTION</th>
                </tr>
            </thead>
            <tbody>
                <%
                    for(int i=0;i<arr.size();i++) {
                %>
                <tr>
                    
                    <th><%out.print(arr.get(i).get("id"));%></th>
                    <th><%out.print(arr.get(i).get("name"));%></th>
                    <th><%out.print(arr.get(i).get("quantity"));%></th>
                        
                    <td>
                        
<!--                        <button>Edit</button>-->
                        
                        <form action="http://localhost:8080/petminor/delete" method="post">
                            <input type="hidden" value="<%out.print(arr.get(i).get("id"));%>" name="id">
                        <button type="submit">Delete</button>
                        </form>
                        </td>
                </tr>
                <%}%>
                
            </tbody>
        </table>
                    
    </body>
</html>
