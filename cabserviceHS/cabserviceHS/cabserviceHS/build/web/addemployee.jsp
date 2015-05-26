

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
                                                    <label >Employee name</label>
                                                    <div >
                                                        <input type="text" name="name" />
                                                    </div>
                                                </div>
                                                 <div >
                                                    <label >Employee email</label>
                                                    <div >
                                                        <input type="text" name="email" />
                                                    </div>
                                                </div>  
                                                 <div >
                                                    <label >password</label>
                                                    <div >
                                                        <input type="text" name="password" />
                                                    </div>
                                                </div>
                                                 <div >
                                                    <label >User type</label>
                                                    <div >
                                                        <input type="text" name="usertype" />
                                                    </div>
                                                </div>
                                                <div >
                                                    <label >mobile</label>
                                                    <div >
                                                        <input type="text" name="mobile" />
                                                    </div>
                                                </div> 
                                                <div >
                                                    <label >location</label>
                                                    <div >
                                                        <input type="text" name="location" />
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
