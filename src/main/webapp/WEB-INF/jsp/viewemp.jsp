  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
   <h1>${heading}</h1>
<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>Name</th><th>Salary</th><th>Designation</th></tr>  
   
   <tr>  
   <td>${command.id}</td>  
   <td>${command.name}</td>  
   <td>${command.salary}</td>  
   <td>${command.designation}</td>  
   </tr>  
   
   </table>  