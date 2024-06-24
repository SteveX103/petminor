
package allservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import oracle.jdbc.OracleConnection;
import oracle.jdbc.OraclePreparedStatement;


public class signup extends HttpServlet {
     String name,email,phone_no,password,qs,ans;
    OracleConnection oconn;
    OraclePreparedStatement ops;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
   
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet signup</title>");            
            out.println("</head>");
            out.println("<body>");
            name=request.getParameter("name");
            email=request.getParameter("email");
            phone_no=request.getParameter("phn");
            password=request.getParameter("password");
            qs=request.getParameter("ques");
            ans=request.getParameter("ans");
//            out.println("<h1>Servlet WorkRegister at " + request.getContextPath() + "</h1>");
//            out.println("<h2>NAME:"+vNAME+"</h2>");
//            out.println("<h2>SLNO:"+vSLNO+"</h2>");
//            out.println("<h2>DOB:"+vDOB+"</h2>");
//            out.println("<h2>GENDER:"+vGEN+"</h2>");
//            out.println("<h2>CITY:"+vCITY+"</h2>");
            try {
                //registration of oracle driver in the servlet
                DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
                //step-3: instantiating the connection object
                oconn = (OracleConnection)
                        DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-NC8LD89:1522:orcle","PETMINOR","DATABASE");
                //step 4: instantiating the statement object
                 ops = (OraclePreparedStatement) 
                        oconn.prepareCall
        ("INSERT INTO SIGNUP(name,email,phone_no,password,very_ques,very_ans)values(?,?,?,?,?,?)");
                 //step 5: CONVERTING JAVA DATE FORMAT TO ORACLE DATE FORMAT
//                  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//                Date dt = sdf.parse(vDOB);
//                SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MMM-yyyy");
//                vDOB = sdf1.format(dt);
                //step 6: filling the query  
                 ops.setString(1, name);
                ops.setString(2, email);
                ops.setString(3, phone_no);
                ops.setString(4, password);
                ops.setString(5, qs);
                ops.setString(6, ans);
                //step7: executing the query
                   int x = ops.executeUpdate();
                
                if(x > 0)
                {
                    
//                    HttpSession httpSession = request.getSession();
//                    httpSession.setAttribute("message","registration successful!!");
                     response.sendRedirect("login.jsp");

//                    out.println("<h2 style='color:green'> Record inserted successfully...");
                }
                else
                {
//                    response.sendRedirect("login.jsp");
                    out.println("<h2 style='color:brown'> Record could not be added...");
                }
                //step8: closing the oracle objects
                ops.close();
                oconn.close();
               
                
                
                
            } 
            //step9: formatting the catch clause
            
            catch (SQLException ex) {
                Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
                
                

                  out.println("<h2 style='color:red'> Error is : " + ex.toString() + "</h2>");
            } 
            
//            catch (ParseException ex) {
//                Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
//            }
            out.println("<h1>Servlet signup at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
