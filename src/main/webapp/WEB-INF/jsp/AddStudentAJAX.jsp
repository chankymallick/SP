<%-- 
    Document   : AddStudentAJAX
    Created on : Jun 8, 2016, 9:57:28 AM
    Author     : Mallick
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<%@taglib  uri="http://www.springframework.org/tags/form" prefix="sp" %>
<!DOCTYPE html>
<html>
    <head>
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.2/jquery.min.js"></script>
    </head>
    <body>
        <h1>${heading}</h1>
        <sp:errors path="student"  />
        <table align="center">
        <form>
            <tr>
                    <th>Student Id</th>
                    <th> <input type="text" id="StudentId" name="StudentId"/></th>
           </tr>
            <tr>
                    <th>Student Name</th>
                    <th><input type="text"   id="StudentName" name="StudentName"/></th>
            </tr> 
            <tr>
                     <th>Save</th>
                    <th><input type="button"value="Submit" id="driver"/></th>
            </tr>
        </form>    
          
        </table>
        <table align="center">
          <tr>
                     <th id="stage"></th>               
            </tr>
         </table>
    
        <script type = "text/javascript" language = "javascript">
         $(document).ready(function() {
            $("#driver").click(function(event){
               var id = $("#StudentId").val();
               var name = $("#StudentName").val();
               $("#stage").load('AddStudentAJAXValue', { "StudentId":id, "StudentName":name} );
            });
         });
      </script>
 
        
        
    </body>
</html>


