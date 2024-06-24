package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cmed_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>cat medicine</title>\n");
      out.write("     <link rel=\"stylesheet\" href=\"nav1.css\">\n");
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
      out.write("            margin-left: 10px;\n");
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
      out.write("     ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "nav.jsp", out, false);
      out.write("\n");
      out.write("    <div class=\"full\">\n");
      out.write("    <div class=\"cat\">\n");
      out.write("        <div class=\"catty\">\n");
      out.write("        <img src=\"catmed1.jpg\" alt=\"pic not found\">\n");
      out.write("        <p class=\"cat1\"><b>HomeoPet Solutions Feline Skin & Itch Drops</b></p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"cat12\">\n");
      out.write("            <p>HomeoPet Solutions Feline Skin & Itch Drops are a homeopathic remedy designed for cats with skin and itch issues. These drops contain natural ingredients that aim to alleviate itching, scratching, and other skin irritations in felines. They are typically used for various skin conditions, including allergies and dry, flaky skin. HomeoPet is a well-known brand in homeopathic pet care, and these drops are commonly used to provide relief from skin-related discomfort in cats.<h2>price:130.00 ₹</h2></p>\n");
      out.write("            <div class=\"cat13\">\n");
      out.write("            QUANTITY: <input type=\"number\" required>\n");
      out.write("            <button><a href=\"#\">order</a></button>\n");
      out.write("            <button><a href=\"#\">add to cart</a></button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"vid1\">\n");
      out.write("        <video controls muted loop autoplay>\n");
      out.write("            <source src=\"vid16.mp4\">\n");
      out.write("        </video>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"full\">\n");
      out.write("    <div class=\"cat\">\n");
      out.write("        <div class=\"catty\">\n");
      out.write("            <img src=\"dogmed4.webp\" alt=\"pic not found\">\n");
      out.write("            <p class=\"cat1\"><b>Albomar</b></p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"cat12\">\n");
      out.write("                <p>Albomar 60 ML- Albendazole 25MG offered by us, refers to a type of oral suspension which is widely used for protecting the life stages of worms. This medicine is mainly used as a complete killing dewormer. This is basically recommended for use for doctors, hospitals, and registered medical practitioners. Albomar 60 ML- Albendazole 25MG acts as a medical supplement for pets, and animals. This supplement is used to treat infections caused by worms. This supplement is used to control gastric and constipation problem in goats, sheeps, and other animals. This supplement should be given to your animals as per your doctors prescription.<h2>price:150.00(60ml.) ₹</h2></p>\n");
      out.write("                <div class=\"cat13\">\n");
      out.write("                QUANTITY: <input type=\"number\" required>\n");
      out.write("                <button><a href=\"#\">order</a></button>\n");
      out.write("                <button><a href=\"#\">add to cart</a></button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"vid1\">\n");
      out.write("        <video controls muted loop autoplay>\n");
      out.write("            <source src=\"vid17.mp4\">\n");
      out.write("        </video>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"full\">\n");
      out.write("    <div class=\"cat\">\n");
      out.write("        <div class=\"catty\">\n");
      out.write("            <img src=\"catmed2.webp\" alt=\"pic not found\">\n");
      out.write("            <p class=\"cat1\"><b>Ronvac Combined Vaccine for Cats </b></p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"cat12\">\n");
      out.write("                <p>Ronvac is an inactivated vaccine containing the 3 core viruses – feline panleucopaenia virus, feline herpesvirus type 1 (rhinotracheitis), and feline calicivirus. Ronvac vaccine is exclusively for feline patients.  Indicated for high-risk animals, such as those who live in shelters or have access to the street. It provides protection against the Feline Respiratory Complex (responsible for over 80% of diseases of the upper respiratory tract in cats). <h2>price:120.00 ₹</h2></p>\n");
      out.write("                <div class=\"cat13\">\n");
      out.write("                QUANTITY: <input type=\"number\" required>\n");
      out.write("                <button><a href=\"#\">order</a></button>\n");
      out.write("                <button><a href=\"#\">add to cart</a></button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"vid1\">\n");
      out.write("        <video controls muted loop autoplay>\n");
      out.write("            <source src=\"vid18.mp4\">\n");
      out.write("        </video>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"full\">\n");
      out.write("    <div class=\"cat\">\n");
      out.write("        <div class=\"catty\">\n");
      out.write("            <img src=\"catmed3.webp\" alt=\"pic not found\">\n");
      out.write("            <p class=\"cat1\"><b>AUDICLEAN - For clean and healthy ears</b></p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"cat12\">\n");
      out.write("                <p>All-natural and safe solution to clean & deodorize the pet’s ears. It removes ear wax and debris, cleanses excessive dirt from the ears, reduces ear itching, irritation and head shaking along by maintaining ear health & controlling bad odor. It helps in reducing the chances of ear infections.<h2>price:130.00(60ml.) ₹</h2></p>\n");
      out.write("                <div class=\"cat13\">\n");
      out.write("                QUANTITY: <input type=\"number\" required>\n");
      out.write("                <button><a href=\"#\">order</a></button>\n");
      out.write("                <button><a href=\"#\">add to cart</a></button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"vid1\">\n");
      out.write("        <video controls muted loop autoplay>\n");
      out.write("            <source src=\"vid19.mp4\">\n");
      out.write("        </video>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"full\">\n");
      out.write("    <div class=\"cat\">\n");
      out.write("        <div class=\"catty\">\n");
      out.write("            <img src=\"catmed4.webp\" alt=\"pic not found\">\n");
      out.write("            <p class=\"cat1\">\t\n");
      out.write("                <b>Areion Vet Feli D Syrup</b></p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"cat12\">\n");
      out.write("                <p>Areion Vet Feli-D Dewomed Oral Suspension For Cats is Efficient and effective treatment, It Broad spectrum protection. A safe and single dose is efficient for effective treatment And No starvation is required before or after treatment . It ensures complete deworming of your cat and provides protection against all form of worm infestations commonly found in pets.<h2>price:95.00(30ml.) ₹</h2></p>\n");
      out.write("                <div class=\"cat13\">\n");
      out.write("                QUANTITY: <input type=\"number\" required>\n");
      out.write("                <button><a href=\"#\">order</a></button>\n");
      out.write("                <button><a href=\"#\">add to cart</a></button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"vid1\">\n");
      out.write("        <video controls muted loop autoplay>\n");
      out.write("            <source src=\"vid20.mp4\">\n");
      out.write("        </video>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>");
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
