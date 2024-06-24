package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dfood_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>DOG FOOD</title>\n");
      out.write("      <link rel=\"stylesheet\" href=\"nav1.css\">\n");
      out.write("    <style>\n");
      out.write("        .dog{\n");
      out.write("            border: 1.5px solid rgb(41, 196, 247);\n");
      out.write("            border-radius: 30px;\n");
      out.write("            height: fit-content;\n");
      out.write("            width: 80%;\n");
      out.write("            padding: 15px;\n");
      out.write("            display: flex;\n");
      out.write("            margin: 10px;\n");
      out.write("            background-color: aliceblue;\n");
      out.write("        }\n");
      out.write("        .dogy img{\n");
      out.write("            height: 130px;\n");
      out.write("            width: 130px;\n");
      out.write("        }\n");
      out.write("        .dog1{\n");
      out.write("            /* display: inline; */\n");
      out.write("            margin-top: 0;\n");
      out.write("            /* text-align: center; */\n");
      out.write("            margin-left: 10%;\n");
      out.write("        }\n");
      out.write("        .dogy{\n");
      out.write("           border-right: 1.5px solid rgb(41, 196, 247);\n");
      out.write("        }\n");
      out.write("        .dog12{\n");
      out.write("            justify-content: center;\n");
      out.write("            padding: 15px;\n");
      out.write("        }\n");
      out.write("        .dog12 h2{\n");
      out.write("            display: inline;\n");
      out.write("        }\n");
      out.write("        .dog13 button{\n");
      out.write("            margin-left: 10%;\n");
      out.write("            width: 180px;\n");
      out.write("            height: 30px;\n");
      out.write("            border-radius: 30px;\n");
      out.write("        }\n");
      out.write("        .dog13 button:hover{\n");
      out.write("            cursor: pointer;\n");
      out.write("            font-size: 1rem;\n");
      out.write("            background-color:rgb(41, 196, 247);\n");
      out.write("        }\n");
      out.write("        .dog13 button a{\n");
      out.write("            text-decoration: none;\n");
      out.write("            color: black;\n");
      out.write("        }\n");
      out.write("        .dog13{\n");
      out.write("            display: inline;\n");
      out.write("            margin-left: 25%;\n");
      out.write("        }\n");
      out.write("        .dog13 input{\n");
      out.write("            border-radius: 20px;\n");
      out.write("            height: 30px;\n");
      out.write("        }\n");
      out.write("        .dog13 select{\n");
      out.write("            border-radius: 20px;\n");
      out.write("            border: 1.5px solid black;\n");
      out.write("            height: 30px;\n");
      out.write("            width: 120px;\n");
      out.write("        }\n");
      out.write("        .full{\n");
      out.write("            display: flex;\n");
      out.write("            margin-top:5%;\n");
      out.write("        }\n");
      out.write("        .vid1 video{\n");
      out.write("            width: 230px;\n");
      out.write("            height: 230px;\n");
      out.write("            margin: 0;\n");
      out.write("            border-radius: 15px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "nav.jsp", out, false);
      out.write("\n");
      out.write("    <div class=\"full\">\n");
      out.write("    <div class=\"dog\">\n");
      out.write("        <div class=\"dogy\">\n");
      out.write("        <img src=\"image/pedi.jpg\" alt=\"pic not found\">\n");
      out.write("        <p class=\"dog1\"><b>Pedigree Dry Dog Food</b></p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"dog12\">\n");
      out.write("            <p>Pedigree is a well-known brand of dog food that has been in the market for decades. They offer a variety of dog food products, including dry kibble and canned options, formulated to meet the nutritional needs of dogs. Pedigree emphasizes the importance of balanced nutrition to support dogs' overall health, including strong teeth and bones. They cater to different life stages and sizes of dogs, making it a popular choice among pet owners.<h2>price:130.00(100g.) ₹</h2></p>\n");
      out.write("            <div class=\"dog13\">\n");
      out.write("            QUANTITY: <input type=\"number\" required>\n");
      out.write("            <button><a href=\"#\">order</a></button>\n");
      out.write("            \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"vid1\">\n");
      out.write("        <video controls muted loop autoplay>\n");
      out.write("            <source src=\"image/vid1.mp4\">\n");
      out.write("        </video>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"full\">\n");
      out.write("    <div class=\"dog\">\n");
      out.write("        <div class=\"dogy\">\n");
      out.write("            <img src=\"image/drools.webp\" alt=\"pic not found\">\n");
      out.write("            <p class=\"dog1\"><b>Drools Optimum Dog Dry Food</b></p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"dog12\">\n");
      out.write("                <p>Drools is a prominent brand in the pet food industry, offering a range of dog food products. Their offerings include dry kibble, wet food, and treats, catering to various dietary preferences and needs. Drools is known for using high-quality ingredients and balanced nutrition in their formulations to support dogs' health and vitality. They have options for different life stages and sizes of dogs, making it a versatile choice for pet owners.<h2>price:160.00(100g.) ₹</h2></p>\n");
      out.write("                <div class=\"dog13\">\n");
      out.write("                QUANTITY: <input type=\"number\" required>\n");
      out.write("                <button><a href=\"#\">order</a></button>\n");
      out.write("                \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"vid1\">\n");
      out.write("        <video controls muted loop autoplay>\n");
      out.write("            <source src=\"image/vid2.mp4\">\n");
      out.write("        </video>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"full\">\n");
      out.write("    <div class=\"dog\">\n");
      out.write("        <div class=\"dogy\">\n");
      out.write("            <img src=\"image/himalaya.png\" alt=\"pic not found\">\n");
      out.write("            <p class=\"dog1\"><b>Himalaya Healthy Dog Dry Food</b></p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"dog12\">\n");
      out.write("                <p>Himalaya Pet Care offers a line of dog food products made with natural and herbal ingredients. Their dog food range includes dry kibble and treats. Himalaya emphasizes the use of botanicals and Ayurvedic principles to promote overall health and well-being in dogs. They offer specialized formulations for various health concerns, such as skin and coat health, joint support, and digestion.<h2>price:120.00(100g.) ₹</h2></p>\n");
      out.write("                <div class=\"dog13\">\n");
      out.write("                QUANTITY: <input type=\"number\" required>\n");
      out.write("                <button><a href=\"#\">order</a></button>\n");
      out.write("                \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"vid1\">\n");
      out.write("        <video controls muted loop autoplay>\n");
      out.write("            <source src=\"image/vid3.mp4\">\n");
      out.write("        </video>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"full\">\n");
      out.write("    <div class=\"dog\">\n");
      out.write("        <div class=\"dogy\">\n");
      out.write("            <img src=\"image/royalcanin.webp\" alt=\"pic not found\">\n");
      out.write("            <p class=\"dog1\"><b>Royal Canin Dog Dry Food</b></p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"dog12\">\n");
      out.write("                <p>Royal Canin is a renowned brand specializing in premium dog food and cat food. Their products are tailored to meet specific dietary needs based on a pet's age, size, breed, and health condition. The company emphasizes scientific research and veterinary input in formulating their pet food, aiming to provide optimal nutrition for pets. Royal Canin offers a wide range of dry and wet dog food options, focusing on promoting overall health and well-being in pets.<h2>price:230.00(100g.) ₹</h2></p>\n");
      out.write("                <div class=\"dog13\">\n");
      out.write("                QUANTITY: <input type=\"number\" required>\n");
      out.write("                <button><a href=\"#\">order</a></button>\n");
      out.write("                \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"vid1\">\n");
      out.write("        <video controls muted loop autoplay>\n");
      out.write("            <source src=\"image/vid4.mp4\">\n");
      out.write("        </video>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"full\">\n");
      out.write("    <div class=\"dog\">\n");
      out.write("        <div class=\"dogy\">\n");
      out.write("            <img src=\"image/purepet.webp\" alt=\"pic not found\">\n");
      out.write("            <p class=\"dog1\">\t\n");
      out.write("                <b>Purepet Dry Dog Food</b></p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"dog12\">\n");
      out.write("                <p>Purepet is a popular brand offering a range of dog food products, including dry kibble and wet food. They aim to provide affordable yet nutritious options for pet owners. Purepet emphasizes the use of high-quality ingredients to support a dog's overall health and vitality. Their formulations cater to different life stages and sizes of dogs, making it accessible to a wide range of pet owners. <h2>price:250.00(100g.) ₹</h2></p>\n");
      out.write("                <div class=\"dog13\">\n");
      out.write("                QUANTITY: <input type=\"number\" required>\n");
      out.write("                <button><a href=\"#\">order</a></button>\n");
      out.write("                \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"vid1\">\n");
      out.write("        <video controls muted loop autoplay>\n");
      out.write("            <source src=\"image/vid5.mp4\">\n");
      out.write("        </video>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
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
