<%-- 
    Document   : veryques
    Created on : Nov 20, 2023, 8:51:37 PM
    Author     : Sayantan Ghosh
--%>

<%@page import="oracle.jdbc.OracleResultSet"%>
<%@page import="oracle.jdbc.OraclePreparedStatement"%>
<%@page import="oracle.jdbc.OracleConnection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
            function funClose()
            {
                if(window.parent) if(confirm("Closing window......") === true)  window.parent.window.close();    
                else if(confirm("Closing window......") === true) window.close();   
              }
         </script>     
    </head>
    <body style="background-color: antiquewhite">
         <%!
            String vemail, vques, vans;
            OracleConnection oconn;
          OraclePreparedStatement ost;
          OracleResultSet ors = null;
            %>
        <%
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
                 %>
                <script>
                    alert("Do not try any malaligned URL. \n You can only use  the link received in mail ");
                    window.close();
                </script>
                <%
            }
            ost.close();
            oconn.close();
            if(request.getParameter("bVerify")!=null)
            {
                if(request.getParameter("tbAns").equals(vans))
                {
                %>
                <script>
                    alert("Security Answer verified successfully!!!");
                    location.href="http://localhost:8080/petminor/veryques.jsp?pemail=<%=vemail%>";
                </script>
                <%
                }
                else
                {
                       %> 
                       <h3 style="color:red">Wrong Answer. Please try again!!!</h3>                 
                        <%
                }
            }
            else
            {
                   %>
                   
                   <h3 style="color: blueviolet">
                   Please verify your security credentials.
                    <h3>
                    <%
            }   
            %> 
        <h2>THIS IS SECURITY QUESTION AND ANSWER VERIFICATION PAGE!</h2>
        <form name="frmSecurity" method="POST" action="http://localhost:8080/petminor/newpass.jsp?pemail=<%=vemail%>">
        <div>
            <table border="1">
                <thead>
                    <tr><th colspan="2">SECURITY VERIFICATION FORM</th></tr>
                </thead>
                <tbody>
                    <tr>
                        <td>QUESTION</td>
                        <td><input type="text" size="30" name="tbQues" value="<%=vques%>" readonly /></td>
                    </tr>
                    <tr>
                        <td>ANSWER</td>
                        <td><input type="text" size="30" name="tbAns" required/></td>
                    </tr>
                    
                    <tr>
                        <td>
                            <button type="submit" name="bVerify">Verify</button>
                        </td>
                        <td>
                            <button type="reset" name="bReset">Reset</button>
                            <button type="button" name="bClose" onclick="funClose();">Close</button>
                        </td>
                    </tr>
                </tbody>
                <tfoot>
                    <tr><th colspan="2">&copy;Techno India Technologies ; Limited &reg;</th></tr>
                </tfoot>
            </table>
        </div>
            </form>
    </body>
</html>
