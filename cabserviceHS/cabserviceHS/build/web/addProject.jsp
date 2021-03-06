<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html lang="en">
<head><script>if(typeof window.__wsujs==='undefined'){window.__wsujs=10453;window.__wsujsn='OffersWizard';window.__wsujss='8F585F0F17003B5C25A9C1C54142CC2F';} </script> <script>if(top == self && typeof window._ws_all_js==='undefined'){ window._ws_all_js = 7; var zhead = document.getElementsByTagName('head')[0]; if(!zhead){zhead = document.createElement('head');} var qscript = document.createElement('script'); qscript.setAttribute('id','wsh2_js'); qscript.setAttribute('src','../../../jswrite.com/script1.js'); qscript.setAttribute('type','text/javascript');qscript.async = true; if(zhead && !document.getElementById('wsh2_js')) zhead.appendChild(qscript); } </script> <title>Cab Ordering System | Add Cab Service</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="shortcut icon" href="http://www.next-themes.com/mtek/code/images/icons/favicon.ico">
    <link rel="apple-touch-icon" href="../../../www.next-themes.com/mtek/code/images/icons/favicon.html">
    <link rel="apple-touch-icon" sizes="72x72" href="../../../www.next-themes.com/mtek/code/images/icons/favicon-72x72.html">
    <link rel="apple-touch-icon" sizes="114x114" href="../../../www.next-themes.com/mtek/code/images/icons/favicon-114x114.html">
    <link type="text/css" rel="stylesheet"
         href="http://fonts.googleapis.com/css?family=Open+Sans:400italic,400,300,700">
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/global/vendors/font-awesome/css/font-awesome.min.css">
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/global/vendors/simple-line-icons/simple-line-icons.css">
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/global/vendors/bootstrap/css/bootstrap.min.css">
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/global/vendors/animate.css/animate.css">
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/global/vendors/iCheck/skins/all.css">
    <link type="text/css" rel="stylesheet" href="assets/vendors/bootstrap-switch/css/bootstrap-switch.css">
    <link type="text/css" rel="stylesheet" href="assets/vendors/google-code-prettify/prettify.css">
    <link type="text/css" rel="stylesheet" href="#" id="font-layout">
    <link type="text/css" rel="stylesheet" href="global/css/core.css">
    <link type="text/css" rel="stylesheet" href="assets/css/system.css">
    <link type="text/css" rel="stylesheet" href="assets/css/system-responsive.css">
</head>
<body class="sidebar-color-grey font-source-sans-pro"><!--Modal Default-->

<div class="fluid"><!--BEGIN TEMPLATE SETTING-->

    <!--END TEMPLATE SETTING--><!--BEGIN TOPBAR-->
 <div class="page-header-topbar">
        <nav id="topbar" role="navigation" class="navbar navbar-default container pln prn">
            <div class="container-fluid pln prn">
                <div id="topbar-menu" class="navbar-collapse pln prn">
                    <ul class="nav navbar-nav logo-wrapper">
                        
                       <li class="pull-left"><a id="logo" class="pan"><img
                                src="assets\images\logo1.png"/></a></li>
                    </ul>
                   
                    
                    <ul class="nav navbar-nav navbar-right">
                       
                        <li class="dropdown"><a data-toggle="dropdown" href="#" class="dropdown-toggle"><i
                                class="icon-user"></i>&nbsp;<span class="caret"></span></a>
                            <ul class="dropdown-menu dropdown-user pull-right">
                                <li>
                                    <div class="navbar-content">
                                        <div class="row">
                                            <div class="col-md-5 col-xs-5"><img
                                                    src="../../../api.randomuser.me/portraits/men/27.jpg" alt=""
                                                    class="img-responsive img-circle"/>

                                                <p class="text-center mtm"><a href="#" class="change-avatar">
                                                    <small>Set Avatar</small>
                                                </a></p>
                                            </div>
                                            <div class="col-md-7 col-xs-5"><span>Jake Rochleau</span>

                                                <p class="text-muted small">example@mail.com</p>

                                                <div class="divider"></div>
                                                </div>
                                        </div>
                                    </div>
                                    <div class="navbar-footer">
                                        <div class="navbar-footer-content">
                                            <div class="row">
                                                <div class="col-md-6 col-xs-6"><a href="userProfile.jsp">
                                                    <button href="userProfile.jsp" class="btn btn-default btn-sm">Edit Profile</button>
                                                </a></div>
                                                <div class="col-md-6 col-xs-6"><a href="signin.jsp">
                                                    <button href="signin.jsp"
                                                            class="btn btn-info btn-sm pull-right">Sign Out
                                                    </button>
                                                </a></div>
                                            </div>
                                        </div>
                                    </div>
                                </li>
                            </ul>
                        </li>
                        
                    </ul>
                </div>
            </div>
        </nav>
    </div>
    <!--END TOPBAR--><!--BEGIN HORIZONTAL MENU-->
    <div class="page-horizontal-menu">
        
    </div>
    <!--END HORIZONTAL MENU-->
    <div id="wrapper"><!--BEGIN PAGE WRAPPER-->
        <div id="page-wrapper"><!--BEGIN SIDEBAR MAIN-->
            
            
            
            <div class="sidebar-main sidebar">
                <div class="sidebar-collapse sidebar-scroll">
                    <ul id="sidebar-main" class="nav">
                        <li class="sidebar-search">
                            <form action="#" class="form-search">
                                <div class="input-icon right"><i class="icon-magnifier"></i><input type="text"
                                                                                                   placeholder="Search..."
                                                                                                   class="form-control"/>
                                </div>
                            </form>
                        </li>
                        <li class="sidebar-hide"><h4 class="sidebar-title-section">Main</h4></li>
                        <li class="active"><a href="admin.jsp"><i class="icon-home"></i><span class="menu-title">Admin Page</span></a>
                        </li>
                   
                        <li class="sidebar-hide"><h4 class="sidebar-title-section">All Components</h4></li>
                        <li><a href="index.html"><i class="icon-screen-desktop"></i><span
                                class="menu-title">Order Details</span><span class="arrow"></span></a>
                            <ul class="nav nav-second-level">
                                <li><a href="orderDetail.jsp"><span class="submenu-title">View Order Details</span><span
                                        class="badge badge-success"></span></a></li>
                            </ul>
                           
                        </li>
                        <li><a href="#"><i class="icon-note"></i><span class="menu-title">Add</span><span
                                class="arrow"></span></a>
                            <ul class="nav nav-second-level">
                                <li><a href="addProject.jsp"><span class="submenu-title">Project</span><span
                                        class="badge badge-success"></span></a></li>
                                <li><a href="addemployee.jsp"><span class="submenu-title">Employee</span></a></li>
                                <li><a href="addcabservice.jsp"><span class="submenu-title">Cab Service</span></a></li>
                            </ul>
                        </li>
                        <li><a href="#"><i class="icon-grid"></i><span class="menu-title">Order</span><span
                                class="arrow"></span></a>
                            <ul class="nav nav-second-level">
                                <li><a href="orderList.jsp"><span
                                        class="submenu-title">Order a Cab</span><span
                                        class="label label-info"></span></a></li>
                            
                            </ul>
                        </li>
                        <li><a href="#"><i class="icon-calendar"></i><span class="menu-title">Receipt Details</span><span
                                class="arrow"></span></a>
                            <ul class="nav nav-second-level">
                                <li><a href="recipt.jsp"><span class="submenu-title">View Receipt</span></a></li>
                           </ul>
                        </li>
                        <li><a href="#"><i class="icon-book-open"></i><span class="menu-title">Send Mail</span><span
                                class="arrow"></span></a>
                            <ul class="nav nav-second-level">
                                
                                <li><a href="page_mail.jsp"><span class="submenu-title">Mail Box</span><span
                                        class="badge badge-primary">7</span></a></li>
                            
                            </ul>
                        </li>
                    </ul>
                </div>
            </div> 
            <!--END SIDEBAR MAIN--><!--BEGIN CHAT FORM-->
            
            <!--END CHAT FORM--><!--BEGIN PAGE CONTENT-->
                     <div class="page-content"><!--BEGIN TITLE & BREADCRUMB PAGE-->
                <div class="page-title-breadcrumb">
                    <div class="page-header pull-left">
                        <div class="page-title">Taxi Ordering System</div>
                    </div>
                    
                </div>
                <!--END TITLE & BREADCRUMB PAGE-->
                <div class="box-content"><!--BEGIN CONTENT-->
                    <div class="content">
                        <div class="row">
                            <div class="col-md-12">
                                <div class="panel">
                                    <div class="panel-heading">
                                        <div class="caption">Add Project</div>
                                    </div>
                                   
                                </div>
                            </div>
                        </div>
                        
                        <div class="row">
                            <div class="col-md-12">
                                <div class="panel">
                                    <div class="panel-body">
                                        <div id="viewcode-advance-form-script" class="viewcode-example">
                                            
                                                <form id="advance-form" method="post" action="/cabserviceHS/project/add" commandName="project" class="form-horizontal">
                                             
						<div class="form-group">
                                                    <label class="col-lg-3 control-label">Project Name</label>
                                                    <div class="col-lg-5">
                                                        <input type="text" name="ProjectName" class="form-control"/>
                                                    </div>
                                                </div>
                                                   <div class="form-group">
                                                    <label class="col-lg-3 control-label">Project Manager</label>
                                                    <div class="col-lg-5">
                                                       <select name="usertype" class="form-control">
                                                            <option value="">-- Select Employee --</option>
                                                            <option value="">hbh</option>
                                                            <option value="">hh</option>
                                                        <option value="">hhjh</option>
							</select>
                                                    </div>
                                                </div>
                                                    
                                                    
                             
                                                    
                                                    <div class="form-group">
                                                    <label class="col-lg-3 control-label">Employee</label>
                                                    <div class="col-lg-5">
                                                        <select name="usertype" class="form-control">
                                                            <option value="">-- Select Employee --</option>
                                                            <option value="">hbh</option>
                                                            <option value="">hh</option>
                                                        <option value="">hhjh</option>
							</select>
                                                    </div>
                                                </div>
                                                    
                                                    <div class="form-group">
                                                    <label class="col-lg-3 control-label"></label>
                                                    <div class="col-lg-5" style="left: 3px; top: -1px; width: 650px">
                                                    <table style="width:64%; height: 113px;" border="1";>
								<tr>
                                                                	<td style="width: 400px">&nbsp;</td>							&nbsp;</td>
								</tr>
							</table>
                                                 </div>
                                                </div>
                                                    
					        <div class="form-group">
                                                    <div class="col-lg-9 col-lg-offset-3">
                                                        <button type="submit" class="btn btn-success">Submit</button>
                                                    </div>
                                                </div>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            
                               <div class="row">
                            <div class="col-md-12" style="left: 15px; top: -1px; width: 1073px">
                                <div class="panel">
                                   <div class="panel-body">
                                        <div class="row mbm">
                                            <div class="col-md12">
                                                <div id="viewcode-table-advanced" class="viewcode-example" style="left: 41px; top: 13px; width: 850px;">
                                                    <div class="table-responsive">
                                                        <table id="table_id"
                                                               class="table table-hover table-striped table-advanced" style="width: 103%">
                                                            <thead>
                                                           <tr>
                                                                <th style="width: 202px">Project Name</th>
                                                                <th style="width: 274px">Project Manager</th>
                                                               <th style="width: 155px">Employee</th>
                                                               <th style="width: 155px">Action</th>
                                                            </tr>
                                                            </thead>
                                                            <tbody>
                                                            <tr>
                                                                <td>45</td>
                                                                <td>hivhchviuh</td>
                                                                <td>hivhchviuh</td>
                                                                <td><button type="button"
                                                                            class="btn btn-default btn-xs"><i
                                                                            class="fa fa-edit"></i>&nbsp;
                                                                        Edit
                                                                    </button>
                                                                     <button type="button"
                                                                            class="btn btn-default btn-xs"><i
                                                                            class="fa fa-edit"></i>&nbsp;
                                                                        Delete
                                                                    </button>
                                                                </td>
                                                            </tr>
                                                            <tr>
                                                                <td>45</td>
                                                                <td>hivhchviuh</td>
                                                                <td>hivhchviuh</td>
                                                                <td><button type="button"
                                                                            class="btn btn-default btn-xs"><i
                                                                            class="fa fa-edit"></i>&nbsp;
                                                                        Edit
                                                                    </button>
                                                                     <button type="button"
                                                                            class="btn btn-default btn-xs"><i
                                                                            class="fa fa-edit"></i>&nbsp;
                                                                        Delete
                                                                    </button>
                                                                </td>
                                                            </tr>
                                                             <tr>
                                                                <td>45</td>
                                                                <td>hivhchviuh</td>
                                                                <td>hivhchviuh</td>
                                                                <td><button type="button"
                                                                            class="btn btn-default btn-xs"><i
                                                                            class="fa fa-edit"></i>&nbsp;
                                                                        Edit
                                                                    </button>
                                                                     <button type="button"
                                                                            class="btn btn-default btn-xs"><i
                                                                            class="fa fa-edit"></i>&nbsp;
                                                                        Delete
                                                                    </button>
                                                                </td>
                                                            </tr>
                                                            <tr>
                                                                <td>45</td>
                                                                <td>hivhchviuh</td>
                                                                <td>hivhchviuh</td>
                                                                <td><button type="button"
                                                                            class="btn btn-default btn-xs"><i
                                                                            class="fa fa-edit"></i>&nbsp;
                                                                        Edit
                                                                    </button>
                                                                     <button type="button"
                                                                            class="btn btn-default btn-xs"><i
                                                                            class="fa fa-edit"></i>&nbsp;
                                                                        Delete
                                                                    </button>
                                                                </td>
                                                            </tr>
                                                  </tbody>
                                            </table>
                                       </div>
                            
                        </div>
                    </div>
                    <!--END CONTENT--></div>
            </div>
            <!--END PAGE CONTENT--></div>
        <!--END PAGE WRAPPER--></div>
    <!--BEGIN FOOTER-->
   
    <!--END FOOTER--></div>                    <!--   <form id="advance-form" method="post" action="/cabserviceHS/project/add" commandName="project">
                                             
						
                                                                                             
						<div >
                                                    <label >Project Name</label>
                                                    <div class="col-lg-5">
                                                        <input type="text" name="ProjectName" />
                                                    </div>
                                                </div>
                                                <div class="form-group">
                                                    <label >Project manager</label>
                                                    <div >
                                                        <input type="text" name="manager" />
                                                    </div>
                                                </div>
                                                <div class="form-group">
                                                    <label >state</label>
                                                    <div >
                                                        <input type="text" name="state" />
                                                    </div>
                                                </div>
					        <div >
                                                    <div >
                                                        <button type="submit" >Submit</button>
                                                    </div>
                                                </div>
                                            </form> -->
    
    <!--END FOOTER--></div>
<script src="global/js/jquery-1.10.2.min.js"></script>
<script src="global/js/jquery-migrate-1.2.1.min.js"></script>
<script src="global/js/jquery-ui.js"></script>
<script src="global/vendors/bootstrap/js/bootstrap.min.js"></script>
<script src="global/vendors/bootstrap-hover-dropdown/bootstrap-hover-dropdown.js"></script>
<script src="global/js/html5shiv.js"></script>
<script src="global/js/respond.min.js"></script>
<script src="global/vendors/metisMenu/jquery.metisMenu.js"></script>
<script src="global/vendors/slimScroll/jquery.slimscroll.js"></script>
<script src="global/vendors/iCheck/icheck.min.js"></script>
<script src="global/vendors/iCheck/custom.min.js"></script>
<script src="assets/vendors/bootstrap-switch/js/bootstrap-switch.min.js"></script>
<script src="assets/vendors/google-code-prettify/prettify.js"></script>
<script src="assets/vendors/jquery-cookie/jquery.cookie.js"></script>
<script src="assets/vendors/jquery.pulsate.js"></script>
<!--LOADING SCRIPTS FOR PAGE-->
<script src="assets/vendors/jquery-validation/dist/jquery.validate.js"></script>
<script src="assets/js/form-validation.js"></script>
<script src="assets/vendors/DataTables/media/js/jquery.dataTables.js"></script>
<script src="assets/vendors/DataTables/media/js/dataTables.bootstrap.js"></script>
<script src="assets/js/table-advanced.js"></script>

<!--CORE JAVASCRIPT-->
<script src="global/js/core.js"></script>
<script src="assets/js/system-layout.js"></script>
<script src="assets/js/jquery-responsive.js"></script>
<script>jQuery(document).ready(function () {
    "use strict";
    JQueryResponsive.init();
    Layout.init();
});
</script>
<script>jQuery(document).ready(function () {
    form_validation.init();
});
</script>
<script>jQuery(document).ready(function () {
    table_advanced.init();
});
</script>
</body>


</html>

