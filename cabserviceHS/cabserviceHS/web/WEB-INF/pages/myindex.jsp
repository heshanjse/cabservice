<%-- 
    Document   : myindex
    Created on : Jun 7, 2015, 3:30:05 PM
    Author     : heshanjayasinghe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
             <h1>
    <jsp:include page="addemployee.jsp"/>
             
   <c:out value="${employee.name}"/>
        </h1>
    </body>
</html>
