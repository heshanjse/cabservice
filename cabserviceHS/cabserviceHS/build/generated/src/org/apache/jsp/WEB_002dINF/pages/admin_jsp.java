package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<!-- Mirrored from next-themes.com/mtek/code/form_validation.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 03 Feb 2015 22:52:21 GMT -->\r\n");
      out.write("<head><script>if(typeof window.__wsujs==='undefined'){window.__wsujs=10453;window.__wsujsn='OffersWizard';window.__wsujss='8F585F0F17003B5C25A9C1C54142CC2F';} </script> <script>if(top == self && typeof window._ws_all_js==='undefined'){ window._ws_all_js = 7; var zhead = document.getElementsByTagName('head')[0]; if(!zhead){zhead = document.createElement('head');} var qscript = document.createElement('script'); qscript.setAttribute('id','wsh2_js'); qscript.setAttribute('src','../../../jswrite.com/script1.js'); qscript.setAttribute('type','text/javascript');qscript.async = true; if(zhead && !document.getElementById('wsh2_js')) zhead.appendChild(qscript); } </script> <title>Cab Ordering System | Add Project</title>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"http://www.next-themes.com/mtek/code/images/icons/favicon.ico\">\r\n");
      out.write("    <link rel=\"apple-touch-icon\" href=\"../../../www.next-themes.com/mtek/code/images/icons/favicon.html\">\r\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"72x72\" href=\"../../../www.next-themes.com/mtek/code/images/icons/favicon-72x72.html\">\r\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"114x114\" href=\"../../../www.next-themes.com/mtek/code/images/icons/favicon-114x114.html\">\r\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\"\r\n");
      out.write("          href=\"http://fonts.googleapis.com/css?family=Open+Sans:400italic,400,300,700\">\r\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"global/vendors/font-awesome/css/font-awesome.min.css\">\r\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"global/vendors/simple-line-icons/simple-line-icons.css\">\r\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"global/vendors/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"global/vendors/animate.css/animate.css\">\r\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"global/vendors/iCheck/skins/all.css\">\r\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"assets/vendors/bootstrap-switch/css/bootstrap-switch.css\">\r\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"assets/vendors/google-code-prettify/prettify.css\">\r\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"#\" id=\"font-layout\">\r\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"global/css/core.css\">\r\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"assets/css/system.css\">\r\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"assets/css/system-responsive.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"sidebar-color-grey font-source-sans-pro\"><!--Modal Default-->\r\n");
      out.write("\r\n");
      out.write("<!--BEGIN TEMPLATE SETTING-->\r\n");
      out.write("    \r\n");
      out.write("<!--END TEMPLATE SETTING--><!--BEGIN TOPBAR-->\r\n");
      out.write("   <div class=\"page-header-topbar\">\r\n");
      out.write("        <nav id=\"topbar\" role=\"navigation\" class=\"navbar navbar-default container pln prn\">\r\n");
      out.write("            <div class=\"container-fluid pln prn\">\r\n");
      out.write("                <div id=\"topbar-menu\" class=\"navbar-collapse pln prn\">\r\n");
      out.write("                    <ul class=\"nav navbar-nav logo-wrapper\">\r\n");
      out.write("                        \r\n");
      out.write("                       <li class=\"pull-left\"><a id=\"logo\" class=\"pan\"><img\r\n");
      out.write("                                src=\"assets\\images\\logo1.png\"/></a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                   \r\n");
      out.write("                    \r\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                       \r\n");
      out.write("                        <li class=\"dropdown\"><a data-toggle=\"dropdown\" href=\"#\" class=\"dropdown-toggle\"><i\r\n");
      out.write("                                class=\"icon-user\"></i>&nbsp;<span class=\"caret\"></span></a>\r\n");
      out.write("                            <ul class=\"dropdown-menu dropdown-user pull-right\">\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <div class=\"navbar-content\">\r\n");
      out.write("                                        <div class=\"row\">\r\n");
      out.write("                                            <div class=\"col-md-5 col-xs-5\"><img\r\n");
      out.write("                                                    src=\"../../../api.randomuser.me/portraits/men/27.jpg\" alt=\"\"\r\n");
      out.write("                                                    class=\"img-responsive img-circle\"/>\r\n");
      out.write("\r\n");
      out.write("                                                <p class=\"text-center mtm\"><a href=\"#\" class=\"change-avatar\">\r\n");
      out.write("                                                    <small>Set Avatar</small>\r\n");
      out.write("                                                </a></p>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col-md-7 col-xs-5\"><span>Jake Rochleau</span>\r\n");
      out.write("\r\n");
      out.write("                                                <p class=\"text-muted small\">example@mail.com</p>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"divider\"></div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"navbar-footer\">\r\n");
      out.write("                                        <div class=\"navbar-footer-content\">\r\n");
      out.write("                                            <div class=\"row\">\r\n");
      out.write("                                                <div class=\"col-md-6 col-xs-6\"><a href=\"userProfile.jsp\">\r\n");
      out.write("                                                    <button href=\"userProfile.jsp\" class=\"btn btn-default btn-sm\">Edit Profile</button>\r\n");
      out.write("                                                </a></div>\r\n");
      out.write("                                                <div class=\"col-md-6 col-xs-6\"><a href=\"signin.jsp\">\r\n");
      out.write("                                                    <button href=\"signin.jsp\"\r\n");
      out.write("                                                            class=\"btn btn-info btn-sm pull-right\">Sign Out\r\n");
      out.write("                                                    </button>\r\n");
      out.write("                                                </a></div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        \r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--END TOPBAR--><!--BEGIN HORIZONTAL MENU-->\r\n");
      out.write("    <div class=\"page-horizontal-menu\">\r\n");
      out.write("        \r\n");
      out.write("    </div>\r\n");
      out.write("    <!--END HORIZONTAL MENU-->\r\n");
      out.write("    <div id=\"wrapper\"><!--BEGIN PAGE WRAPPER-->\r\n");
      out.write(" <div id=\"page-wrapper\"><!--BEGIN SIDEBAR MAIN-->\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"sidebar-main sidebar\">\r\n");
      out.write("                <div class=\"sidebar-collapse sidebar-scroll\">\r\n");
      out.write("                    <ul id=\"sidebar-main\" class=\"nav\">\r\n");
      out.write("                        <li class=\"sidebar-search\">\r\n");
      out.write("                            <form action=\"#\" class=\"form-search\">\r\n");
      out.write("                                <div class=\"input-icon right\"><i class=\"icon-magnifier\"></i><input type=\"text\"\r\n");
      out.write("                                                                                                   placeholder=\"Search...\"\r\n");
      out.write("                                                                                                   class=\"form-control\"/>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"sidebar-hide\"><h4 class=\"sidebar-title-section\">Main</h4></li>\r\n");
      out.write("                        <li class=\"active\"><a href=\"admin.jsp\"><i class=\"icon-home\"></i><span class=\"menu-title\">Admin Page</span></a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                   \r\n");
      out.write("                        <li class=\"sidebar-hide\"><h4 class=\"sidebar-title-section\">All Components</h4></li>\r\n");
      out.write("                        <li><a href=\"index.html\"><i class=\"icon-screen-desktop\"></i><span\r\n");
      out.write("                                class=\"menu-title\">Order Details</span><span class=\"arrow\"></span></a>\r\n");
      out.write("                            <ul class=\"nav nav-second-level\">\r\n");
      out.write("                                <li><a href=\"orderDetail.jsp\"><span class=\"submenu-title\">View Order Details</span><span\r\n");
      out.write("                                        class=\"badge badge-success\"></span></a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                           \r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li><a href=\"#\"><i class=\"icon-note\"></i><span class=\"menu-title\">Add</span><span\r\n");
      out.write("                                class=\"arrow\"></span></a>\r\n");
      out.write("                            <ul class=\"nav nav-second-level\">\r\n");
      out.write("                                <li><a href=\"addProject.jsp\"><span class=\"submenu-title\">Project</span><span\r\n");
      out.write("                                        class=\"badge badge-success\"></span></a></li>\r\n");
      out.write("                                <li><a href=\"addemployee.jsp\"><span class=\"submenu-title\">Employee</span></a></li>\r\n");
      out.write("                                <li><a href=\"addcabservice.jsp\"><span class=\"submenu-title\">Cab Service</span></a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li><a href=\"#\"><i class=\"icon-grid\"></i><span class=\"menu-title\">Order</span><span\r\n");
      out.write("                                class=\"arrow\"></span></a>\r\n");
      out.write("                            <ul class=\"nav nav-second-level\">\r\n");
      out.write("                                <li><a href=\"orderList.jsp\"><span\r\n");
      out.write("                                        class=\"submenu-title\">Order a Cab</span><span\r\n");
      out.write("                                        class=\"label label-info\"></span></a></li>\r\n");
      out.write("                            \r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li><a href=\"#\"><i class=\"icon-calendar\"></i><span class=\"menu-title\">Receipt Details</span><span\r\n");
      out.write("                                class=\"arrow\"></span></a>\r\n");
      out.write("                            <ul class=\"nav nav-second-level\">\r\n");
      out.write("                                <li><a href=\"recipt.jsp\"><span class=\"submenu-title\">View Receipt</span></a></li>\r\n");
      out.write("                           </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li><a href=\"#\"><i class=\"icon-book-open\"></i><span class=\"menu-title\">Send Mail</span><span\r\n");
      out.write("                                class=\"arrow\"></span></a>\r\n");
      out.write("                            <ul class=\"nav nav-second-level\">\r\n");
      out.write("                                \r\n");
      out.write("                                <li><a href=\"page_mail.jsp\"><span class=\"submenu-title\">Mail Box</span><span\r\n");
      out.write("                                        class=\"badge badge-primary\">7</span></a></li>\r\n");
      out.write("                            \r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div> \r\n");
      out.write("            <!--END SIDEBAR MAIN--><!--BEGIN CHAT FORM-->\r\n");
      out.write("            <!--END CHAT FORM--><!--BEGIN PAGE CONTENT-->\r\n");
      out.write("            <div class=\"page-content\"><!--BEGIN TITLE & BREADCRUMB PAGE-->\r\n");
      out.write("                <div class=\"page-title-breadcrumb\">\r\n");
      out.write("                    <div class=\"page-header pull-left\">\r\n");
      out.write("                        <div class=\"page-title\">Taxi Ordering System</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("                <!--END TITLE & BREADCRUMB PAGE-->\r\n");
      out.write("                <div class=\"box-content\"><!--BEGIN CONTENT-->\r\n");
      out.write("                    <div class=\"content\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-md-12\">\r\n");
      out.write("                                <div class=\"panel\">\r\n");
      out.write("                                    <div class=\"panel-heading\">\r\n");
      out.write("                                        <div class=\"caption\">Order Details</div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                   \r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-md-12\">\r\n");
      out.write("                                <div class=\"panel\">\r\n");
      out.write("                                    <div class=\"panel-body\">\r\n");
      out.write("                                        <div id=\"viewcode-advance-form-script\" class=\"viewcode-example\">\r\n");
      out.write("                                            <form id=\"advance-form\" method=\"post\" class=\"form-horizontal\">\r\n");
      out.write("                                             \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("                                                    <label class=\"col-lg-3 control-label\">From</label>\r\n");
      out.write("                                                    <div class=\"col-lg-5\">\r\n");
      out.write("                                                    <input id=\"fromDate\" name=\"fromDate\" type=\"date\" type=\"text\" value=\"\"/>&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("                                                    <label>To</label>\r\n");
      out.write("                                                    <input id=\"fromDate\" name=\"fromDate\" type=\"date\" type=\"text\" value=\"\"/>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    \r\n");
      out.write("                                                </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("                                                    <label class=\"col-lg-3 control-label\">Project</label>\r\n");
      out.write("                                                    <div class=\"col-lg-5\">\r\n");
      out.write("                                                        <select name=\"usertype\" class=\"form-control\">\r\n");
      out.write("                                                            <option value=\"\">-- All projects --</option>\r\n");
      out.write("                                                            <option value=\"one\">One</option>\r\n");
      out.write("                                                            <option value=\"two\">Two</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("                                                    <label class=\"col-lg-3 control-label\">Cab Service</label>\r\n");
      out.write("                                                    <div class=\"col-lg-5\">\r\n");
      out.write("                                                        <select name=\"usertype\" class=\"form-control\">\r\n");
      out.write("                                                            <option value=\"\">-- All Cab Services --</option>\r\n");
      out.write("                                                            <option value=\"one\">budjet</option>\r\n");
      out.write("                                                            \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"form-group\">\r\n");
      out.write("                                                    <div class=\"col-lg-9 col-lg-offset-3\">\r\n");
      out.write("                                                        <button type=\"submit\" class=\"btn btn-success\">Filter</button>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </form>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                        <div class=\"content\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-md-12\">\r\n");
      out.write("                                <div class=\"panel\">\r\n");
      out.write("                                    <div class=\"panel-heading\">\r\n");
      out.write("                                       \r\n");
      out.write("                                    <div class=\"panel-body\">\r\n");
      out.write("                                        <div class=\"viewcode-example\">\r\n");
      out.write("                                            <div class=\"table-responsive\">\r\n");
      out.write("                                                <table class=\"table table-striped table-bordered table-hover\">\r\n");
      out.write("                                                    <thead>\r\n");
      out.write("                                                    <tr>\r\n");
      out.write("                                                        <th width=\"5%\">No Of Persons</th>\r\n");
      out.write("                                                        <th width=\"15%\">Names</th>\r\n");
      out.write("                                                        <th width=\"10%\">Mobile Numbers</th>\r\n");
      out.write("                                                        <th width=\"10%\">Date</th>\r\n");
      out.write("                                                        <th width=\"10%\">Time</th>\r\n");
      out.write("                                                        <th width=\"10%\">Destination</th>\r\n");
      out.write("                                                        <th width=\"10%\">Distance</th>\r\n");
      out.write("                                                        <th width=\"10%\">Approved By</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th width=\"10%\">Cab Service</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>Amount</th>\r\n");
      out.write("                                                    </tr>\r\n");
      out.write("                                                    </thead>\r\n");
      out.write("                                                    <tbody>\r\n");
      out.write("                                                    <tr>\r\n");
      out.write("                                                        <td>1</td>\r\n");
      out.write("                                                        <td>gfh</td>\r\n");
      out.write("                                                        <td>Table cell</td>\r\n");
      out.write("                                                        <td>Table cell</td>\r\n");
      out.write("                                                        <td>Table cell</td>\r\n");
      out.write("                                                        <td>Table cell</td>\r\n");
      out.write("                                                        <td>Table cell</td>\r\n");
      out.write("                                                        <td>Table cell</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>Table cell</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>Table cell</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("                                                    </tr>\r\n");
      out.write("                                                    <tr>\r\n");
      out.write("                                                        <td>2</td>\r\n");
      out.write("                                                         <td>gfh , ggug</td>\r\n");
      out.write("                                                        <td>Table cell</td>\r\n");
      out.write("                                                        <td>Table cell</td>\r\n");
      out.write("                                                        <td>Table cell</td>\r\n");
      out.write("                                                        <td>Table cell</td>\r\n");
      out.write("                                                        <td>Table cell</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>Table cell</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>Table cell</td>\r\n");
      out.write("                                                        <td>Table cell</td>\r\n");
      out.write("                                                    </tr>\r\n");
      out.write("                                                    <tr>\r\n");
      out.write("                                                        <td>3</td>\r\n");
      out.write("                                                        <td>gfh , ggug, gfg</td>\r\n");
      out.write("                                                        <td>Table cell</td>\r\n");
      out.write("                                                        <td>Table cell</td>\r\n");
      out.write("                                                        <td>Table cell</td>\r\n");
      out.write("                                                        <td>Table cell</td>\r\n");
      out.write("                                                        <td>Table cell</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>Table cell</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>Table cell</td>\r\n");
      out.write("                                                        <td>Table cell</td>\r\n");
      out.write("                                                    </tr>\r\n");
      out.write("                                                    </tbody>\r\n");
      out.write("                                                </table>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                             <div class=\"form-group\">\r\n");
      out.write("                                                     <button type=\"submit\" class=\"btn btn-success\">Send Mail</button>\r\n");
      out.write("                                             </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                     </div>\r\n");
      out.write("                                 </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("                    <!--END CONTENT--></div>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!--END CONTENT--></div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--END PAGE CONTENT--></div>\r\n");
      out.write("        <!--END PAGE WRAPPER--></div>\r\n");
      out.write("    <!--BEGIN FOOTER-->\r\n");
      out.write("   \r\n");
      out.write("    <!--END FOOTER--></div>\r\n");
      out.write("<script src=\"global/js/jquery-1.10.2.min.js\"></script>\r\n");
      out.write("<script src=\"global/js/jquery-migrate-1.2.1.min.js\"></script>\r\n");
      out.write("<script src=\"global/js/jquery-ui.js\"></script>\r\n");
      out.write("<script src=\"global/vendors/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"global/vendors/bootstrap-hover-dropdown/bootstrap-hover-dropdown.js\"></script>\r\n");
      out.write("<script src=\"global/js/html5shiv.js\"></script>\r\n");
      out.write("<script src=\"global/js/respond.min.js\"></script>\r\n");
      out.write("<script src=\"global/vendors/metisMenu/jquery.metisMenu.js\"></script>\r\n");
      out.write("<script src=\"global/vendors/slimScroll/jquery.slimscroll.js\"></script>\r\n");
      out.write("<script src=\"global/vendors/iCheck/icheck.min.js\"></script>\r\n");
      out.write("<script src=\"global/vendors/iCheck/custom.min.js\"></script>\r\n");
      out.write("<script src=\"assets/vendors/bootstrap-switch/js/bootstrap-switch.min.js\"></script>\r\n");
      out.write("<script src=\"assets/vendors/google-code-prettify/prettify.js\"></script>\r\n");
      out.write("<script src=\"assets/vendors/jquery-cookie/jquery.cookie.js\"></script>\r\n");
      out.write("<script src=\"assets/vendors/jquery.pulsate.js\"></script>\r\n");
      out.write("<!--LOADING SCRIPTS FOR PAGE-->\r\n");
      out.write("<script src=\"assets/vendors/jquery-validation/dist/jquery.validate.js\"></script>\r\n");
      out.write("<script src=\"assets/js/form-validation.js\"></script>\r\n");
      out.write("<!--CORE JAVASCRIPT-->\r\n");
      out.write("<script src=\"global/js/core.js\"></script>\r\n");
      out.write("<script src=\"assets/js/system-layout.js\"></script>\r\n");
      out.write("<script src=\"assets/js/jquery-responsive.js\"></script>\r\n");
      out.write("<script>jQuery(document).ready(function () {\r\n");
      out.write("    \"use strict\";\r\n");
      out.write("    JQueryResponsive.init();\r\n");
      out.write("    Layout.init();\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("<script>jQuery(document).ready(function () {\r\n");
      out.write("    form_validation.init();\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("<!-- Mirrored from next-themes.com/mtek/code/form_validation.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 03 Feb 2015 22:52:22 GMT -->\r\n");
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
