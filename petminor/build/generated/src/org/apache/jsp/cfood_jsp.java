package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cfood_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>CAT FOOD</title>\n");
      out.write("      <link rel=\"stylesheet\" href=\"nav1.css\">\n");
      out.write("    <style>\n");
      out.write("        .cat{\n");
      out.write("            border: 1.5px solid rgb(41, 196, 247);\n");
      out.write("            border-radius: 30px;\n");
      out.write("            height: fit-content;\n");
      out.write("            width: 80%;\n");
      out.write("            padding: 15px;\n");
      out.write("            display: flex;\n");
      out.write("            margin: 10px;\n");
      out.write("            background-color: aliceblue;\n");
      out.write("        }\n");
      out.write("        .catty img{\n");
      out.write("            height: 130px;\n");
      out.write("            width: 130px;\n");
      out.write("        }\n");
      out.write("        .cat1{\n");
      out.write("            /* display: inline; */\n");
      out.write("            margin-top: 0;\n");
      out.write("            /* text-align: center; */\n");
      out.write("            margin-left: 10%;\n");
      out.write("        }\n");
      out.write("        .catty{\n");
      out.write("           border-right: 1.5px solid rgb(41, 196, 247);\n");
      out.write("           \n");
      out.write("        }\n");
      out.write("        .cat12{\n");
      out.write("            justify-content: center;\n");
      out.write("            padding: 15px;\n");
      out.write("        }\n");
      out.write("        .cat12 h2{\n");
      out.write("            display: inline;\n");
      out.write("        }\n");
      out.write("        .cat13 button{\n");
      out.write("            margin-left: 10%;\n");
      out.write("            width: 180px;\n");
      out.write("            height: 30px;\n");
      out.write("            border-radius: 30px;\n");
      out.write("        }\n");
      out.write("        .cat13 button:hover{\n");
      out.write("            cursor: pointer;\n");
      out.write("            font-size: 1rem;\n");
      out.write("            background-color:rgb(41, 196, 247);\n");
      out.write("        }\n");
      out.write("        .cat13 button a{\n");
      out.write("            text-decoration: none;\n");
      out.write("            color: black;\n");
      out.write("        }\n");
      out.write("        .cat13{\n");
      out.write("            display: inline;\n");
      out.write("            margin-left: 25%;\n");
      out.write("        }\n");
      out.write("        .cat13 input{\n");
      out.write("            border-radius: 20px;\n");
      out.write("            height: 30px;\n");
      out.write("        }\n");
      out.write("        .cat13 select{\n");
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
      out.write("    <div class=\"cat\">\n");
      out.write("        <div class=\"catty\">\n");
      out.write("        <img src=\"image/whiskas.jpg\" alt=\"pic not found\">\n");
      out.write("        <p class=\"cat1\"><b>Whiskas Cat Dry Food for Adult Cats</b></p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"cat12\">\n");
      out.write("            <p>Whiskas is a well-known brand specializing in cat food products. They offer a variety of options, including dry kibble and wet food, designed to meet the nutritional needs of cats. Whiskas cat food is formulated to provide a balanced diet that supports feline health and vitality. The brand often focuses on taste and texture preferences to cater to cats' discerning palates.<h2>price:130.00(100g.) ₹</h2></p>\n");
      out.write("            <div class=\"cat13\">\n");
      out.write("            QUANTITY: <input type=\"number\" required>\n");
      out.write("            <button><a href=\"#\">order</a></button>\n");
      out.write("            \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"vid1\">\n");
      out.write("        <video controls muted loop autoplay>\n");
      out.write("            <source src=\"image/vid6.mp4\">\n");
      out.write("        </video>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"full\">\n");
      out.write("    <div class=\"cat\">\n");
      out.write("        <div class=\"catty\">\n");
      out.write("            <img src=\"image/purepetc.webp\" alt=\"pic not found\">\n");
      out.write("            <p class=\"cat1\"><b>Purepet Adult Dry Cat Food</b></p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"cat12\">\n");
      out.write("                <p>Purepet offers a range of cat food products, including dry kibble and wet food, designed to provide balanced nutrition for cats. The brand focuses on affordability while maintaining quality standards in its formulations. Purepet cat food caters to different life stages and dietary preferences of felines, making it accessible to a wide range of cat owners. It aims to support overall cat health and well-being while being budget-friendly.<h2>price:160.00(100g.) ₹</h2></p>\n");
      out.write("                <div class=\"cat13\">\n");
      out.write("                QUANTITY: <input type=\"number\" required>\n");
      out.write("                <button><a href=\"#\">order</a></button>\n");
      out.write("                \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"vid1\">\n");
      out.write("        <video controls muted loop autoplay>\n");
      out.write("            <source src=\"image/vid7.mp4\">\n");
      out.write("        </video>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"full\">\n");
      out.write("    <div class=\"cat\">\n");
      out.write("        <div class=\"catty\">\n");
      out.write("            <img src=\"image/droolsc1.webp\" alt=\"pic not found\">\n");
      out.write("            <p class=\"cat1\"><b>Drools Food for Adult Cat</b></p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"cat12\">\n");
      out.write("                <p>Drools is a reputable brand in the pet food industry, offering a variety of cat food products, including dry kibble and wet food. They emphasize high-quality ingredients and nutritional balance to support feline health. Drools cat food is formulated to meet the specific dietary needs of cats at different life stages and with various preferences. The brand is known for its commitment to scientific research and development in crafting pet food, making it a trusted choice among cat owners. <h2>price:120.00(100g.) ₹</h2></p>\n");
      out.write("                <div class=\"cat13\">\n");
      out.write("                QUANTITY: <input type=\"number\" required>\n");
      out.write("                <button><a href=\"#\">order</a></button>\n");
      out.write("                \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"vid1\">\n");
      out.write("        <video controls muted loop autoplay>\n");
      out.write("            <source src=\"image/vid8.mp4\">\n");
      out.write("        </video>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"full\">\n");
      out.write("    <div class=\"cat\">\n");
      out.write("        <div class=\"catty\">\n");
      out.write("            <img src=\"image/grainzero.webp\" alt=\"pic not found\">\n");
      out.write("            <p class=\"cat1\"><b>Grain Zero Dry Cat Food</b></p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"cat12\">\n");
      out.write("                <p>KEY BENEFITS: High-quality protein from deboned sardine, mackerel & chicken liver helps build strong muscles. An optimum balance of Omega 3 & 6 fatty acids promotes shiny coat and healthy skin. We use only high quality, human grade protein & natural sources of fibre to provide optimal nutrient absorption.<h2>price:230.00(100g.) ₹</h2></p>\n");
      out.write("                <div class=\"cat13\">\n");
      out.write("                QUANTITY: <input type=\"number\" required>\n");
      out.write("                <button><a href=\"#\">order</a></button>\n");
      out.write("                \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"vid1\">\n");
      out.write("        <video controls muted loop autoplay>\n");
      out.write("            <source src=\"image/vid9.mp4\">\n");
      out.write("        </video>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"full\">\n");
      out.write("    <div class=\"cat\">\n");
      out.write("        <div class=\"catty\">\n");
      out.write("            <img src=\"image/meo.jpg\" alt=\"pic not found\">\n");
      out.write("            <p class=\"cat1\">\t\n");
      out.write("                <b>ME-O Tuna Adult Dry Cat Food</b></p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"cat12\">\n");
      out.write("                <p>Me-O is a popular brand of cat food known for its wide range of products. They offer dry kibble and wet food options designed to meet the nutritional needs of cats. Me-O emphasizes the use of high-quality ingredients and balanced nutrition to support feline health. Their formulations cater to various life stages and preferences of cats, making it a widely recognized choice among cat owners.<h2>price:250.00(100g.) ₹</h2></p>\n");
      out.write("                <div class=\"cat13\">\n");
      out.write("                QUANTITY: <input type=\"number\" required>\n");
      out.write("                <button><a href=\"#\">order</a></button>\n");
      out.write("               \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"vid1\">\n");
      out.write("        <video controls muted loop autoplay>\n");
      out.write("            <source src=\"image/vid10.mp4\">\n");
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
