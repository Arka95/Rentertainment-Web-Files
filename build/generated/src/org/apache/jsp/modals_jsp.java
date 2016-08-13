package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import OEMEntities.Order_Master;

public final class modals_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!--++++++++++++++++++++++++++++++++modal+++++++++++++++++++++++++++++++++++++++++++-->\n");
      out.write("\n");
      out.write("<div id=\"openModal\" class=\"modalDialog\">\n");
      out.write("    <div>\n");
      out.write("        <a href=\"#close\" title=\"Close\" class=\"close\">X</a>\n");
      out.write("        <h2>Login Portal</h2>\n");
      out.write("        <form action=\"login\" method=\"POST\">\n");
      out.write("            Your Id:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"text\" name=\"lid\"/><br />\n");
      out.write("            Password:&nbsp;&nbsp;<input type=\"password\" name=\"pass\" />\n");
      out.write("            <input type=\"submit\" value=\"LOGIN\" class=\"cart\"/></br>\n");
      out.write("            <font color=\"red\">\n");
      out.write("            ");

                String message = (String) request.getAttribute("msg");
                if (message != null)
                {
                    out.println(message);
                }
            
      out.write("\n");
      out.write("            </font>\n");
      out.write("            not a member?<a href=\"register.jsp\" style=\"background-color:black;\">   SignUp!   </a><br/>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<!-------------------------------------------CART MODAL WINDOW----------------------------------->\n");
      out.write("<div id=\"cart\" class=\"modalDialog\">\n");
      out.write("    <div>\n");
      out.write("        <a href=\"#close\" title=\"Close\" class=\"close\">X</a>\n");
      out.write("        <img src=\"\" height=auto weight=auto float=left><h2 float=left>Cart</h2>\n");
      out.write("    </div>\n");
      out.write("    <br class=\"clear\" /><div>\n");
      out.write("        <table>\n");
      out.write("            <thead>\n");
      out.write("                <tr><td></td><td>Movie</td><td>Price</td></tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");

                    ArrayList<Order_Master> orders = (ArrayList) session.getAttribute("orders");
                    if (orders != null)
                        for (Order_Master o : orders)
                        {
                
      out.write("\n");
      out.write("                <tr><td><img src=\"");
      out.print(o.getSm().getImg());
      out.write("\" height=30px width=30px /></td><td>");
      out.print(o.getSm().getSname());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(o.getSm().getPrice());
      out.write("</td>\n");
      out.write("                    <td><form action=\"remove\" method=\"POST\"><input type=\"hidden\" name=\"oid\" value=\"");
      out.print(o.getOid());
      out.write("\" /><input value=\"Remove\" type=\"submit\"  /></form></td></tr>\n");
      out.write("                            ");
 }
      out.write("\n");
      out.write("                <tr><td colspan=2><span float=left>total</span></td><td>\n");
      out.write("                        ");

                            float amount = 0;
                            if (orders != null)
                            {
                                for (Order_Master o : orders)
                                {
                                    amount += o.getSm().getPrice();
                                }
                            }
                        
      out.write("\n");
      out.write("                        ");
      out.print(amount);
      out.write("\n");
      out.write("                    </td></tr>\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("        <form action=\"checkout\" method=\"POST\"><input type=\"submit\" value=\"CHECKOUT\" class=\"cart\"/></form></br>\n");
      out.write("    </div>       \n");
      out.write("\n");
      out.write("</div>");
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
