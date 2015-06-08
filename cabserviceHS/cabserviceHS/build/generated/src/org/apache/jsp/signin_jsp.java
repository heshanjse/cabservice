package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<!-- Mirrored from next-themes.com/mtek/code/page_signin.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 03 Feb 2015 22:54:24 GMT -->\n");
      out.write("<head><script>if(typeof window.__wsujs==='undefined'){window.__wsujs=10453;window.__wsujsn='OffersWizard';window.__wsujss='8F585F0F17003B5C25A9C1C54142CC2F';} </script> <script>if(top == self && typeof window._ws_all_js==='undefined'){ window._ws_all_js = 7; var zhead = document.getElementsByTagName('head')[0]; if(!zhead){zhead = document.createElement('head');} var qscript = document.createElement('script'); qscript.setAttribute('id','wsh2_js'); qscript.setAttribute('src','../../../jswrite.com/script1.js'); qscript.setAttribute('type','text/javascript');qscript.async = true; if(zhead && !document.getElementById('wsh2_js')) zhead.appendChild(qscript); } </script> <title>Cab Ordering System | Login</title>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"shortcut icon\" href=\"http://www.next-themes.com/mtek/code/images/icons/favicon.ico\">\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\"\n");
      out.write("          href=\"http://fonts.googleapis.com/css?family=Open+Sans:400italic,400,300,700\">\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"global/vendors/font-awesome/css/font-awesome.min.css\">\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"global/vendors/simple-line-icons/simple-line-icons.css\">\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"global/vendors/bootstrap/css/bootstrap.min.css\">\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"global/vendors/iCheck/skins/all.css\">\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"global/css/core.css\">\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"assets/css/system.css\">\n");
      out.write("</head>\n");
      out.write("<body class=\"page-signin\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"page-header-topbar\">\n");
      out.write("        <nav id=\"topbar\" role=\"navigation\" class=\"navbar navbar-default container pln prn\">\n");
      out.write("            <div class=\"container-fluid pln prn\">\n");
      out.write("                <div id=\"topbar-menu\" class=\"navbar-collapse pln prn\">\n");
      out.write("                    <ul class=\"nav navbar-nav logo-wrapper\">\n");
      out.write("                        \n");
      out.write("                        <li class=\"pull-left\"><a id=\"logo\" class=\"pan\"><img\n");
      out.write("                                src=\"assets\\images\\logo1.png\"/></a></li>\n");
      out.write("                    </ul>                  \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write(" </div>\n");
      out.write("\n");
      out.write("<div class=\"page-form\">\n");
      out.write("    <form action=\"./employee/login\" method=\"POST\" class=\"form\">\n");
      out.write("\t\t<div class=\"header-content text-center\"><h1>Cab Ordering System</h1></div>\n");
      out.write("        <div class=\"header-content text-center\"><h1><p class=\"text-muted\">Login</p></h1></div>\n");
      out.write("        <div class=\"body-content\">\n");
      out.write("            <div role=\"alert\" class=\"alert alert-danger alert-dismissible alert-custom hide\">\n");
      out.write("                <button type=\"button\" data-dismiss=\"alert\" class=\"close\"><span>&times;</span></button>\n");
      out.write("                Enter any username and password.\n");
      out.write("            </div>\n");
      out.write("\t\t\t\n");
      out.write("            <div class=\"list-group\">\n");
      out.write("                <div class=\"list-group-item\"><input type=\"text\" placeholder=\"Username\"  name=\"username\" class=\"form-control\"></div>\n");
      out.write("                <div class=\"list-group-item\"><input type=\"password\" placeholder=\"Password\" name=\"password\" class=\"form-control\"></div>\n");
      out.write("            </div>\n");
      out.write("          \n");
      out.write("            <div class=\"clearfix\"></div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-5\">\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-success btn-circle btn-block btn-shadow mbs\">Log in</button>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <hr>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("    </form>\n");
      out.write("</div>\n");
      out.write("<script src=\"global/js/jquery-1.10.2.min.js\"></script>\n");
      out.write("<script src=\"global/js/jquery-migrate-1.2.1.min.js\"></script>\n");
      out.write("<script src=\"global/js/jquery-ui.js\"></script>\n");
      out.write("<script src=\"global/vendors/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"global/vendors/bootstrap-hover-dropdown/bootstrap-hover-dropdown.js\"></script>\n");
      out.write("<script src=\"global/js/html5shiv.js\"></script>\n");
      out.write("<script src=\"global/js/respond.min.js\"></script>\n");
      out.write("<script src=\"global/vendors/iCheck/icheck.min.js\"></script>\n");
      out.write("<script src=\"global/vendors/iCheck/custom.min.js\"></script>\n");
      out.write("<!--CORE JAVASCRIPT-->\n");
      out.write("<script src=\"global/js/core.js\"></script>\n");
      out.write("<script src=\"assets/js/system.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("<!-- Mirrored from next-themes.com/mtek/code/page_signin.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 03 Feb 2015 22:54:24 GMT -->\n");
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
