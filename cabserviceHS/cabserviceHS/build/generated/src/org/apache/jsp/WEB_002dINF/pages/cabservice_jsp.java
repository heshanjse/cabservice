package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cabservice_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<head><script>if(typeof window.__wsujs==='undefined'){window.__wsujs=10453;window.__wsujsn='OffersWizard';window.__wsujss='8F585F0F17003B5C25A9C1C54142CC2F';} </script> <script>if(top == self && typeof window._ws_all_js==='undefined'){ window._ws_all_js = 7; var zhead = document.getElementsByTagName('head')[0]; if(!zhead){zhead = document.createElement('head');} var qscript = document.createElement('script'); qscript.setAttribute('id','wsh2_js'); qscript.setAttribute('src','../../../jswrite.com/script1.js'); qscript.setAttribute('type','text/javascript');qscript.async = true; if(zhead && !document.getElementById('wsh2_js')) zhead.appendChild(qscript); } </script> <title>Cab Ordering System | Add Cab Service</title>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"shortcut icon\" href=\"http://www.next-themes.com/mtek/code/images/icons/favicon.ico\">\n");
      out.write("    <link rel=\"apple-touch-icon\" href=\"../../../www.next-themes.com/mtek/code/images/icons/favicon.html\">\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"72x72\" href=\"../../../www.next-themes.com/mtek/code/images/icons/favicon-72x72.html\">\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"114x114\" href=\"../../../www.next-themes.com/mtek/code/images/icons/favicon-114x114.html\">\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\"\n");
      out.write("          href=\"http://fonts.googleapis.com/css?family=Open+Sans:400italic,400,300,700\">\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("global/vendors/font-awesome/css/font-awesome.min.css\">\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("global/vendors/simple-line-icons/simple-line-icons.css\">\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("global/vendors/bootstrap/css/bootstrap.min.css\">\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("global/vendors/animate.css/animate.css\">\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("global/vendors/iCheck/skins/all.css\">\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"assets/vendors/bootstrap-switch/css/bootstrap-switch.css\">\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"assets/vendors/google-code-prettify/prettify.css\">\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"#\" id=\"font-layout\">\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"global/css/core.css\">\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"assets/css/system.css\">\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"assets/css/system-responsive.css\">\n");
      out.write("</head>\n");
      out.write("<body class=\"sidebar-color-grey font-source-sans-pro\"><!--Modal Default-->\n");
      out.write("<div id=\"source-modal\" class=\"modal fade\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("                <button type=\"button\" data-dismiss=\"modal\" class=\"close\">&times;</button>\n");
      out.write("                <h4 id=\"modal-default-label\" class=\"modal-title\">View Code</h4></div>\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("                <pre class=\"prettyprint linenums\"></pre>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<!--BEGIN TEMPLATE SETTING-->\n");
      out.write("<!--END TEMPLATE SETTING--><!--BEGIN TOPBAR-->\n");
      out.write("   <div class=\"page-header-topbar\">\n");
      out.write("        <nav id=\"topbar\" role=\"navigation\" class=\"navbar navbar-default container pln prn\">\n");
      out.write("            <div class=\"container-fluid pln prn\">\n");
      out.write("                <div id=\"topbar-menu\" class=\"navbar-collapse pln prn\">\n");
      out.write("                    <ul class=\"nav navbar-nav logo-wrapper\">\n");
      out.write("                        \n");
      out.write("                       <li class=\"pull-left\"><a id=\"logo\" class=\"pan\"><img\n");
      out.write("                                src=\"assets\\images\\logo1.png\"/></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                   \n");
      out.write("                    \n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                       \n");
      out.write("                        <li class=\"dropdown\"><a data-toggle=\"dropdown\" href=\"#\" class=\"dropdown-toggle\"><i\n");
      out.write("                                class=\"icon-user\"></i>&nbsp;<span class=\"caret\"></span></a>\n");
      out.write("                            <ul class=\"dropdown-menu dropdown-user pull-right\">\n");
      out.write("                                <li>\n");
      out.write("                                    <div class=\"navbar-content\">\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-md-5 col-xs-5\"><img\n");
      out.write("                                                    src=\"../../../api.randomuser.me/portraits/men/27.jpg\" alt=\"\"\n");
      out.write("                                                    class=\"img-responsive img-circle\"/>\n");
      out.write("\n");
      out.write("                                                <p class=\"text-center mtm\"><a href=\"#\" class=\"change-avatar\">\n");
      out.write("                                                    <small>Set Avatar</small>\n");
      out.write("                                                </a></p>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-md-7 col-xs-5\"><span>Jake Rochleau</span>\n");
      out.write("\n");
      out.write("                                                <p class=\"text-muted small\">example@mail.com</p>\n");
      out.write("\n");
      out.write("                                                <div class=\"divider\"></div>\n");
      out.write("                                                </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"navbar-footer\">\n");
      out.write("                                        <div class=\"navbar-footer-content\">\n");
      out.write("                                            <div class=\"row\">\n");
      out.write("                                                <div class=\"col-md-6 col-xs-6\"><a href=\"userProfile.jsp\">\n");
      out.write("                                                    <button href=\"userProfile.jsp\" class=\"btn btn-default btn-sm\">Edit Profile</button>\n");
      out.write("                                                </a></div>\n");
      out.write("                                                <div class=\"col-md-6 col-xs-6\"><a href=\"signin.jsp\">\n");
      out.write("                                                    <button href=\"signin.jsp\"\n");
      out.write("                                                            class=\"btn btn-info btn-sm pull-right\">Sign Out\n");
      out.write("                                                    </button>\n");
      out.write("                                                </a></div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        \n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    </div>\n");
      out.write("    <!--END TOPBAR--><!--BEGIN HORIZONTAL MENU-->\n");
      out.write("\n");
      out.write("    <!--END HORIZONTAL MENU-->\n");
      out.write("    <div id=\"wrapper\"><!--BEGIN PAGE WRAPPER-->\n");
      out.write("        <div id=\"page-wrapper\"><!--BEGIN SIDEBAR MAIN-->\n");
      out.write("          \n");
      out.write("            \n");
      out.write("            <div class=\"sidebar-main sidebar\">\n");
      out.write("                <div class=\"sidebar-collapse sidebar-scroll\">\n");
      out.write("                    <ul id=\"sidebar-main\" class=\"nav\">\n");
      out.write("                        <li class=\"sidebar-search\">\n");
      out.write("                            <form action=\"#\" class=\"form-search\">\n");
      out.write("                                <div class=\"input-icon right\"><i class=\"icon-magnifier\"></i><input type=\"text\"\n");
      out.write("                                                                                                   placeholder=\"Search...\"\n");
      out.write("                                                                                                   class=\"form-control\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"sidebar-hide\"><h4 class=\"sidebar-title-section\">Main</h4></li>\n");
      out.write("                        <li class=\"active\"><a href=\"admin.jsp\"><i class=\"icon-home\"></i><span class=\"menu-title\">Admin Page</span></a>\n");
      out.write("                        </li>\n");
      out.write("                   \n");
      out.write("                        <li class=\"sidebar-hide\"><h4 class=\"sidebar-title-section\">All Components</h4></li>\n");
      out.write("                        <li><a href=\"index.html\"><i class=\"icon-screen-desktop\"></i><span\n");
      out.write("                                class=\"menu-title\">Order Details</span><span class=\"arrow\"></span></a>\n");
      out.write("                            <ul class=\"nav nav-second-level\">\n");
      out.write("                                <li><a href=\"orderDetail.jsp\"><span class=\"submenu-title\">View Order Details</span><span\n");
      out.write("                                        class=\"badge badge-success\"></span></a></li>\n");
      out.write("                            </ul>\n");
      out.write("                           \n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"icon-note\"></i><span class=\"menu-title\">Add</span><span\n");
      out.write("                                class=\"arrow\"></span></a>\n");
      out.write("                            <ul class=\"nav nav-second-level\">\n");
      out.write("                                <li><a href=\"addProject.jsp\"><span class=\"submenu-title\">Project</span><span\n");
      out.write("                                        class=\"badge badge-success\"></span></a></li>\n");
      out.write("                                <li><a href=\"addemployee.jsp\"><span class=\"submenu-title\">Employee</span></a></li>\n");
      out.write("                                <li><a href=\"addcabservice.jsp\"><span class=\"submenu-title\">Cab Service</span></a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"icon-grid\"></i><span class=\"menu-title\">Order</span><span\n");
      out.write("                                class=\"arrow\"></span></a>\n");
      out.write("                            <ul class=\"nav nav-second-level\">\n");
      out.write("                                <li><a href=\"orderList.jsp\"><span\n");
      out.write("                                        class=\"submenu-title\">Order a Cab</span><span\n");
      out.write("                                        class=\"label label-info\"></span></a></li>\n");
      out.write("                            \n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"icon-calendar\"></i><span class=\"menu-title\">Receipt Details</span><span\n");
      out.write("                                class=\"arrow\"></span></a>\n");
      out.write("                            <ul class=\"nav nav-second-level\">\n");
      out.write("                                <li><a href=\"recipt.jsp\"><span class=\"submenu-title\">View Receipt</span></a></li>\n");
      out.write("                           </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"icon-book-open\"></i><span class=\"menu-title\">Send Mail</span><span\n");
      out.write("                                class=\"arrow\"></span></a>\n");
      out.write("                            <ul class=\"nav nav-second-level\">\n");
      out.write("                                \n");
      out.write("                                <li><a href=\"page_mail.jsp\"><span class=\"submenu-title\">Mail Box</span><span\n");
      out.write("                                        class=\"badge badge-primary\">7</span></a></li>\n");
      out.write("                            \n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div> \n");
      out.write("            <!--END SIDEBAR MAIN--><!--BEGIN CHAT FORM-->\n");
      out.write("            \n");
      out.write("            <!--END CHAT FORM--><!--BEGIN PAGE CONTENT-->\n");
      out.write("            <div class=\"page-content\"><!--BEGIN TITLE & BREADCRUMB PAGE-->\n");
      out.write("                <div class=\"page-title-breadcrumb\">\n");
      out.write("                    <div class=\"page-header pull-left\">\n");
      out.write("                        <div class=\"page-title\">Taxi Ordering System</div>\n");
      out.write("                    </div>\n");
      out.write("                    <ol class=\"breadcrumb page-breadcrumb hidden-xs hidden\">\n");
      out.write("                        <li><i class=\"fa fa-home\"></i>&nbsp;<a href=\"index.html\">Home</a>&nbsp;&nbsp;<i\n");
      out.write("                                class=\"fa fa-angle-right\"></i>&nbsp;&nbsp;</li>\n");
      out.write("                        <li><a href=\"#\">Forms</a>&nbsp;&nbsp;<i class=\"fa fa-angle-right\"></i>&nbsp;&nbsp;</li>\n");
      out.write("                        <li class=\"active\">Form Validation</li>\n");
      out.write("                    </ol>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <!--END TITLE & BREADCRUMB PAGE-->\n");
      out.write("                <div class=\"box-content\"><!--BEGIN CONTENT-->\n");
      out.write("                    <div class=\"content\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-12\">\n");
      out.write("                                <div class=\"panel\">\n");
      out.write("                                    <div class=\"panel-heading\">\n");
      out.write("                                        <div class=\"caption\">Add Cab Service</div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                         <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-12\">\n");
      out.write("                                <div class=\"panel\">\n");
      out.write("                                    <div class=\"panel-body\">\n");
      out.write("                                        <div id=\"viewcode-advance-form-script\" class=\"viewcode-example\">\n");
      out.write("                                            <form id=\"advance-form\" method=\"post\" class=\"form-horizontal\" action=\"/cabserviceHS/cabservice/add\" commandName=\"cabservice\">\n");
      out.write("                                           <div class=\"form-group\">\n");
      out.write("                                                    <label class=\"col-lg-3 control-label\">Cab Service Name</label>\n");
      out.write("                                                    <div class=\"col-lg-5\">\n");
      out.write("                                                        <input type=\"text\" name=\"name\" class=\"form-control\"/>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("                                                    <label class=\"col-lg-3 control-label\">Email Address</label>\n");
      out.write("                                                    <div class=\"col-lg-5\">\n");
      out.write("                                                        <input type=\"text\" name=\"email\" class=\"form-control\"/>\n");
      out.write("                                                </div>\n");
      out.write("                                                </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("                                                    <label class=\"col-lg-3 control-label\">Phone Number</label>\n");
      out.write("                                                    <div class=\"col-lg-5\">\n");
      out.write("                                                        <input type=\"text\" name=\"mobile\" class=\"form-control\"/>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("                                                    <label class=\"col-lg-3 control-label\">Initial Amount</label>\n");
      out.write("                                                    <div class=\"col-lg-5\">\n");
      out.write("                                                        <input type=\"number\" step=\"any\" name=\"initical_amount\" class=\"form-control\"/>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("                                                    <label class=\"col-lg-3 control-label\">Rate Per km</label>\n");
      out.write("                                                    <div class=\"col-lg-5\">\n");
      out.write("                                                        <input type=\"number\" step=\"any\" name=\"rate\" class=\"form-control\"/>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t \n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <div class=\"col-lg-9 col-lg-offset-3\">\n");
      out.write("                                                        <button type=\"submit\" class=\"btn btn-success\">Submit</button>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </form>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-12\" style=\"left: 15px; top: 1px; width: 1075px\">\n");
      out.write("                                <div class=\"panel\">\n");
      out.write("                                   <div class=\"panel-body\">\n");
      out.write("                                        <div class=\"row mbm\">\n");
      out.write("                                            <div class=\"col-md12\">\n");
      out.write("                                                <div id=\"viewcode-table-advanced\" class=\"viewcode-example\" style=\"left: 1px; top: 2px\">\n");
      out.write("                                                    <div class=\"table-responsive\">\n");
      out.write("                                                        <table id=\"table_id\"\n");
      out.write("                                                               class=\"table table-hover table-striped table-advanced\" style=\"width: 95%\">\n");
      out.write("                                                            <thead>\n");
      out.write("                                                            <tr>\n");
      out.write("                                                                <th>Cab Service Name</th>\n");
      out.write("                                                                <th>Email Address</th>\n");
      out.write("                                                                <th>Phone Number</th>\n");
      out.write("                                                                <th>Initial Amount(Rs.)</th>\n");
      out.write("                                                                <th>Rate Per Km</th>\n");
      out.write("                                                                <th>Actions</th>\n");
      out.write("                                                            </tr>\n");
      out.write("                                                            </thead>\n");
      out.write("                                                            <tbody>\n");
      out.write("                                                            <tr>\n");
      out.write("                                                                <td>jhfkjdhjdhj</td>\n");
      out.write("                                                                <td>ckjdh@gmail.com</td>\n");
      out.write("                                                                <td>0716556545</td>\n");
      out.write("                                                                <td>100</td>\n");
      out.write("                                                                <td>40</td>\n");
      out.write("                                                                <td>\n");
      out.write("                                                                     <button type=\"button\"\n");
      out.write("                                                                            class=\"btn btn-default btn-xs\"><i\n");
      out.write("                                                                            class=\"fa fa-edit\"></i>&nbsp;\n");
      out.write("                                                                        Edit\n");
      out.write("                                                                    </button>\n");
      out.write("                                                                    <button type=\"button\"\n");
      out.write("                                                                            class=\"btn btn-default btn-xs\"><i\n");
      out.write("                                                                            class=\"fa fa-edit\"></i>&nbsp;\n");
      out.write("                                                                       Delete\n");
      out.write("                                                                    </button>\n");
      out.write("                                                                </td>\n");
      out.write("                                                            </tr>\n");
      out.write("                                                              <tr>\n");
      out.write("                                                                <td>jhfkjdhjdhj</td>\n");
      out.write("                                                                <td>ckjdh@gmail.com</td>\n");
      out.write("                                                                <td>0716556545</td>\n");
      out.write("                                                                <td>100</td>\n");
      out.write("                                                                <td>40</td>\n");
      out.write("                                                                <td>\n");
      out.write("                                                                     <button type=\"button\"\n");
      out.write("                                                                            class=\"btn btn-default btn-xs\"><i\n");
      out.write("                                                                            class=\"fa fa-edit\"></i>&nbsp;\n");
      out.write("                                                                        Edit\n");
      out.write("                                                                    </button>\n");
      out.write("                                                                    <button type=\"button\"\n");
      out.write("                                                                            class=\"btn btn-default btn-xs\"><i\n");
      out.write("                                                                            class=\"fa fa-edit\"></i>&nbsp;\n");
      out.write("                                                                       Delete\n");
      out.write("                                                                    </button>\n");
      out.write("                                                                \t&nbsp;</td>\n");
      out.write("                                                            </tr> \n");
      out.write("                                                             <tr>\n");
      out.write("                                                                <td>jhfkjdhjdhj</td>\n");
      out.write("                                                                <td>ckjdh@gmail.com</td>\n");
      out.write("                                                                <td>0716556545</td>\n");
      out.write("                                                                <td>100</td>\n");
      out.write("                                                                <td>40</td>\n");
      out.write("                                                                <td>\n");
      out.write("                                                                     <button type=\"button\"\n");
      out.write("                                                                            class=\"btn btn-default btn-xs\"><i\n");
      out.write("                                                                            class=\"fa fa-edit\"></i>&nbsp;\n");
      out.write("                                                                        Edit\n");
      out.write("                                                                    </button>\n");
      out.write("                                                                    <button type=\"button\"\n");
      out.write("                                                                            class=\"btn btn-default btn-xs\"><i\n");
      out.write("                                                                            class=\"fa fa-edit\"></i>&nbsp;\n");
      out.write("                                                                       Delete\n");
      out.write("                                                                    </button>\n");
      out.write("                                                                </td>\n");
      out.write("                                                            </tr>\n");
      out.write("                                                             <tr>\n");
      out.write("                                                                <td>jhfkjdhjdhj</td>\n");
      out.write("                                                                <td>ckjdh@gmail.com</td>\n");
      out.write("                                                                <td>0716556545</td>\n");
      out.write("                                                                <td>100</td>\n");
      out.write("                                                                <td>40</td>\n");
      out.write("                                                                <td >\n");
      out.write("                                                                    <button type=\"button\"\n");
      out.write("                                                                            class=\"btn btn-default btn-xs\"><i\n");
      out.write("                                                                            class=\"fa fa-edit\"></i>&nbsp;\n");
      out.write("                                                                        Edit\n");
      out.write("                                                                    </button>\n");
      out.write("                                                                    <button type=\"button\"\n");
      out.write("                                                                            class=\"btn btn-default btn-xs\"><i\n");
      out.write("                                                                            class=\"fa fa-edit\"></i>&nbsp;\n");
      out.write("                                                                       Delete\n");
      out.write("                                                                    </button>\n");
      out.write("                                                                </td>\n");
      out.write("                                                            </tr>\n");
      out.write("                                                          </tbody>\n");
      out.write("                                                            </table>\n");
      out.write("                                                    </div\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!--END CONTENT--></div>\n");
      out.write("            </div>\n");
      out.write("            <!--END PAGE CONTENT--></div>\n");
      out.write("        <!--END PAGE WRAPPER--></div>\n");
      out.write("    <!--BEGIN FOOTER-->\n");
      out.write("   \n");
      out.write("    <!--END FOOTER--></div>\n");
      out.write("<script src=\"global/js/jquery-1.10.2.min.js\"></script>\n");
      out.write("<script src=\"global/js/jquery-migrate-1.2.1.min.js\"></script>\n");
      out.write("<script src=\"global/js/jquery-ui.js\"></script>\n");
      out.write("<script src=\"global/vendors/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"global/js/html5shiv.js\"></script>\n");
      out.write("<script src=\"global/js/respond.min.js\"></script>\n");
      out.write("<script src=\"global/vendors/metisMenu/jquery.metisMenu.js\"></script>\n");
      out.write("<script src=\"global/vendors/slimScroll/jquery.slimscroll.js\"></script>\n");
      out.write("<script src=\"global/vendors/iCheck/icheck.min.js\"></script>\n");
      out.write("<script src=\"global/vendors/iCheck/custom.min.js\"></script>\n");
      out.write("<script src=\"assets/vendors/bootstrap-switch/js/bootstrap-switch.min.js\"></script>\n");
      out.write("<script src=\"assets/vendors/google-code-prettify/prettify.js\"></script>\n");
      out.write("<script src=\"assets/vendors/jquery-cookie/jquery.cookie.js\"></script>\n");
      out.write("<script src=\"assets/vendors/jquery.pulsate.js\"></script>\n");
      out.write("<!--LOADING SCRIPTS FOR PAGE-->\n");
      out.write("<script src=\"assets/vendors/jquery-validation/dist/jquery.validate.js\"></script>\n");
      out.write("<script src=\"assets/js/form-validation.js\"></script>\n");
      out.write("<script src=\"assets/vendors/DataTables/media/js/jquery.dataTables.js\"></script>\n");
      out.write("<script src=\"assets/vendors/DataTables/media/js/dataTables.bootstrap.js\"></script>\n");
      out.write("<script src=\"assets/js/table-advanced.js\"></script>\n");
      out.write("\n");
      out.write("<!--CORE JAVASCRIPT-->\n");
      out.write("<script src=\"global/js/core.js\"></script>\n");
      out.write("<script src=\"assets/js/system-layout.js\"></script>\n");
      out.write("<script src=\"assets/js/jquery-responsive.js\"></script>\n");
      out.write("<script>jQuery(document).ready(function () {\n");
      out.write("    \"use strict\";\n");
      out.write("    JQueryResponsive.init();\n");
      out.write("    Layout.init();\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("<script>jQuery(document).ready(function () {\n");
      out.write("    form_validation.init();\n");
      out.write("});\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("<script>jQuery(document).ready(function () {\n");
      out.write("    table_advanced.init();\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("      \n");
      out.write("              \n");
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