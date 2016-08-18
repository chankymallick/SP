<%-- 
    Document   : allStudent
    Created on : 6 Jun, 2016, 5:50:29 PM
    Author     : Chanky-JVM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <h1>${heading}</h1>
        <c:forEach var="std"  items="${List}">
            ${std.studentId} :  ${std.studentName} <br>
             ---------------------------------------------<br>
        </c:forEach>
    </body>
</html>
