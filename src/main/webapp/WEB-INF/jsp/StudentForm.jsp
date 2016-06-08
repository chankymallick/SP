<%-- 
    Document   : StudentForm
    Created on : May 20, 2016, 2:40:43 PM
    Author     : Mallick
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  uri="http://www.springframework.org/tags/form" prefix="sp" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <sp:form action="addStudent/chanky" method="POST">
            <sp:input path="StudentId"/>
            <sp:input path="StudentName"/>    
            <input type="submit" value="Submit"/>
        </sp:form>
           
    </body>
</html>
