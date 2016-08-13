package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import OEMEntities.Stock_Master;
import org.hibernate.Criteria;
import org.hibernate.Session;
import java.util.Random;
import org.hibernate.criterion.Restrictions;
import java.util.ArrayList;
import OEMEntities.Order_Master;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/head.jsp");
    _jspx_dependants.add("/modals.jsp");
  }

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

      out.write("\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("        <title>RENTerTainMent</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"layout/styles/layout.css\" type=\"text/css\" />\n");
      out.write("        <script type=\"text/javascript\" src=\"layout/scripts/jquery.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"layout/scripts/jquery.jcarousel.pack.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"layout/scripts/jquery.jcarousel.setup.js\"></script>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body id=\"top\">\n");
      out.write("        <!-- ####################################################################################################### -->\n");
      out.write("      ");
      out.write("<div class=\"wrapper col1\">\n");
      out.write("    <div id=\"header\">\n");
      out.write("        <div id=\"logo\">\n");
      out.write("            <h1><a href=\"index.jsp\">@RENTerTainMent</a></h1>\n");
      out.write("            <p>only the best entertainment collections</p>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"topnav\">\n");
      out.write("            <ul>\n");
      out.write("                <li class=\"active\"><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                <li><a href=\"contact.jsp\">CONTACT US</a></li>\n");
      out.write("                <li><a href=\"about.jsp\">About Us</a></li>\n");
      out.write("                <li>\n");
      out.write("                    ");

                        String lid = (String) session.getAttribute("lid");
                        if ((lid)!=null)
                        {
                            String fname = (String) session.getAttribute("fname");
                            
      out.write("\n");
      out.write("                            <a href=\"#\">WELCOME ");
      out.print(fname);
      out.write("</a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"profile.jsp\">Profile</a></li>\n");
      out.write("                                <li><a href=\"#cart\">CART</a></li>\n");
      out.write("                                ");

                                    if(session.getAttribute("msg").equals("ADMIN"))
                                    {
                                
      out.write("\n");
      out.write("                                <li><a href=\"admin.jsp\">Admin Panel</a></li>\n");
      out.write("                                ");

                                    }
                                
      out.write("\n");
      out.write("                                <li><a href=\"logout\">LogOut</a></li></ul>\n");
      out.write("                    ");

                            //out.print("<a href=\"#\">WELCOME " + fname + "</a><ul><li><a href=\"profile.jsp\">Profile</a></li><li><a href=\"#cart\">CART</a></li><li><a href=\"logout\">LogOut</a></li></ul>");
                        } else
                        {
                    
      out.write("\n");
      out.write("                    <a href=\"#\">JOIN US</a>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"#openModal\">Login</a></li>\n");
      out.write("                        <li><a href=\"register.jsp\">SignUp</a></li>                        \n");
      out.write("                    </ul>\n");
      out.write("                    ");
 }
                    
      out.write("\n");
      out.write("                </li>\n");
      out.write("                <li><table class=\"navg\"><form action=\"search.jsp\"><td><input type=\"submit\" value=\"SEARCH\"/></td><td><input type=\"search\" name=\"search\" /></td></form></table></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <br class=\"clear\" />\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!--++++++++++++++++++++++++++++++++modal+++++++++++++++++++++++++++++++++++++++++++-->\n");
      out.write("\n");
      out.write("        <!-- ####################################################################################################### -->\n");
      out.write("        ");

        ArrayList<Order_Master> order=(ArrayList<Order_Master>)session.getAttribute("orders");
        if(order==null)
        {
            order=new ArrayList<Order_Master>();
            session.setAttribute("orders", order);
        }
        
      out.write("\n");
      out.write("        <div class=\"wrapper col2\">\n");
      out.write("            <div id=\"featured_slide\">\n");
      out.write("                <div id=\"featured_content\">\n");
      out.write("                    <ul>\n");
      out.write("                        ");

                                int i;
                            Random r = new Random();
                            Session se = DAOLayer.HibDAOLayer.getSession();
                            Criteria c = se.createCriteria(Stock_Master.class);
                            List<Stock_Master> mdata = c.list();
                            for ( i = 0; i <= 2; i++)
                            {
                                
                                int v = (r.nextInt()) % (mdata.size());
                                v = (v >= 0) ? v : (-v);
                                Stock_Master sd = mdata.get(v);
                        
      out.write("\n");
      out.write("\n");
      out.write("                        <li><img src=\"");
      out.print(sd.getImg());
      out.write("\" alt=\"Database error\" />\n");
      out.write("                            <div class=\"floater\">\n");
      out.write("                                <h2>");
      out.print(sd.getSname());
      out.write("</h2>\n");
      out.write("                                <pre>Release date: ");
      out.print(sd.getYear());
      out.write("\n");
      out.write("Director: ");
      out.print(sd.getDirector());
      out.write("\n");
      out.write("Screenplay:");
      out.print(sd.getCast());
      out.write("\n");
      out.write("Version:");
      out.print(sd.getVersion());
      out.write("\n");
      out.write("                                </pre>\n");
      out.write("                                <p class=\"readmore\"><a href=\"search.jsp?search=");
      out.print(sd.getSname());
      out.write("\">Continue Reading &raquo;</a></p>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <a href=\"javascript:void(0);\" id=\"featured-item-prev\"><img src=\"layout/images/prev.png\" alt=\"\" /></a> <a href=\"javascript:void(0);\" id=\"featured-item-next\"><img src=\"layout/images/next.png\" alt=\"\" /></a> </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- ####################################################################################################### -->\n");
      out.write("        <div class=\"wrapper col3\">\n");
      out.write("            <div id=\"container\">\n");
      out.write("                <div class=\"homepage\">\n");
      out.write("                    ");

                            for(int j=0;j<2;j++)
                            {
                    
      out.write("\n");
      out.write("                    <ul>\n");
      out.write("                        \n");
      out.write("                            ");

                                for(i=0;i<=2;i++)
                                {
                                    int v = (r.nextInt()) % (mdata.size());
                                v = (v >= 0) ? v : (-v);
                                Stock_Master sd = mdata.get(v);
                            
      out.write("\n");
      out.write("                            <li>\n");
      out.write("                            <h2><img src=\"");
      out.print(sd.getImg());
      out.write("\" alt=\"bummer!\" height=\"100px\" width=\"100px\" />");
      out.print(sd.getSname());
      out.write("</h2>\n");
      out.write("                            <p>Release date: ");
      out.print(sd.getYear());
      out.write("</br>\n");
      out.write("                                Director: ");
      out.print(sd.getDirector());
      out.write("</br>\n");
      out.write("                                Screenplay:");
      out.print(sd.getCast());
      out.write("</br>\n");
      out.write("                                Version:");
      out.print(sd.getVersion());
      out.write("\n");
      out.write("                                </p>\n");
      out.write("                                <p class=\"readmore\"><a href=\"search.jsp?search=");
      out.print(sd.getSname());
      out.write("\">Continue Reading &raquo;</a></p>\n");
      out.write("                        </li>\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("                            \n");
      out.write("                    </ul>\n");
      out.write("                            </br></br>\n");
      out.write("                    <br class=\"clear\" />\n");
      out.write("                    ");

                            }
                    
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- ####################################################################################################### -->\n");
      out.write("        <div class=\"wrapper col4\">\n");
      out.write("  <div id=\"footer\">\n");
      out.write("    <div class=\"box1\">\n");
      out.write("      <h2>A Little Company Information !</h2>\n");
      out.write("      <img class=\"imgl\" src=\"es/rentertainment.jpg\" alt=\"\" />\n");
      out.write("      <p>Rentertainment has some of the best movie and tv show collections in the world. So come join us and explore a fascinating range of dvds at a nominal charge.Register Today !</p>\n");
      out.write("      <p>All Rights Reserved.</p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"box contactdetails\">\n");
      out.write("      <h2>Our Contact Details !</h2>\n");
      out.write("      <ul>\n");
      out.write("        <li>RENTERTAINMENT Media Industries Pvt. Ltd</li>\n");
      out.write("        <li>276/1,NagendraNath Road &amp; Number</li>\n");
      out.write("        <li>Kolkata</li>\n");
      out.write("        <li>700028</li>\n");
      out.write("        <li>Tel:+917278194445</li>\n");
      out.write("        <li>Email1: mehluv@gmail.com</li>\n");
      out.write("        <li>Email2: arka.bhowmik95@.com</li>\n");
      out.write("        <li class=\"last\">LinkedIn: <a href=\"#\">Company Profile</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("      <div class=\"box flickrbox\">\n");
      out.write("      <h2>Latest Movies !</h2>\n");
      out.write("      <div class=\"wrap\">\n");
      out.write("        <div class=\"fix\"></div>\n");
      out.write("           ");

                        
                            for ( i = 0; i <= 5; i++)
                            {
                                
                                int v = (r.nextInt()) % (mdata.size());
                                v = (v >= 0) ? v : (-v);
                                Stock_Master sd = mdata.get(v);
                        
      out.write("\n");
      out.write("    \n");
      out.write("                        <div class=\"flickr_badge_image\" id=\"flickr_badge_image1\"><a href=\"search.jsp?search=");
      out.print(sd.getSname());
      out.write("\"><img src=\"");
      out.print(sd.getImg());
      out.write("\" alt=\"\" height=75px width=75px\"/></a></div>\n");
      out.write("        ");

             }
        
      out.write("\n");
      out.write("       \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <br class=\"clear\" />\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<!-- ####################################################################################################### -->\n");
      out.write("<div class=\"wrapper col5\">\n");
      out.write("  <div id=\"copyright\">\n");
      out.write("    <p class=\"fl_left\">Copyright &copy; 2015 - All Rights Reserved - <a href=\"\">www.rentertainment.com</a></p>\n");
      out.write("    <p class=\"fl_right\">Licensed by <a target=\"_blank\" href=\"http://www.w3schools.com\" title=\"\">@RENTerTaiNment</a></p>\n");
      out.write("    <br class=\"clear\" />\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("    </body>\n");
      out.write("    ");
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
      out.write("\n");
      out.write(" </html>");
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
