<%-- 
    Document   : StudentForm
    Created on : May 20, 2016, 2:40:43 PM
    Author     : Mallick
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  uri="http://www.springframework.org/tags/form" prefix="sp" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <h1>${heading}</h1>
      
        <sp:form action="addStudent/chanky" method="POST">
            <sp:input path="StudentId"/>
            <sp:input path="StudentName"/>    
            <input type="submit" value="Submit"/>
        </sp:form>
           
    </body>
</html>
