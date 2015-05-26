<%-- 
    Document   : addemployee
    Created on : Apr 3, 2015, 6:41:07 PM
    Author     : heshanjayasinghe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <form id="advance-form" method="post" action="/cabserviceHS/employee/add" commandName="employee">
                                             
						<div >
                                                    <label >cabservice name</label>
                                                    <div >
                                                        <input type="text" name="name" />
                                                    </div>
                                                </div>
                                                 <div >
                                                    <label >cabservice email</label>
                                                    <div >
                                                        <input type="text" name="email" />
                                                    </div>
                                                </div>  
                                                 <div >
                                                    <label >cabservice phone no</label>
                                                    <div >
                                                        <input type="text" name="mobile" />
                                                    </div>
                                                </div>
                                                 <div >
                                                    <label >rate per km</label>
                                                    <div >
                                                        <input type="text" name="rate" />
                                                    </div>
                                                </div>
                                                <div >
                                                    <label >initial amount</label>
                                                    <div >
                                                        <input type="text" name="initical_amount" />
                                                    </div>
                                                </div> 
                                                 
            
						<!--<div >
                                                    <label >Project Name</label>
                                                    <div class="col-lg-5">
                                                        <input type="text" name="ProjectName1" />
                                                        <input type="text" name="ProjectName2" />
                                                    </div>
                                                </div>-->
					        <div >
                                                    <div >
                                                        <button type="submit" >Submit</button>
                                                    </div>
                                                </div>
                                            </form>
    </body>
</html>
