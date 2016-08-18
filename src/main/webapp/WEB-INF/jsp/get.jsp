<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
   <h1>${heading}</h1>
       <form method="get" action="getStudentData">    
        <table >    
         <tr>    
          <td>Name : </td>   
          <td><input type="text"name="sid"  /></td>  
         </tr> 
         <tr>    
          <td colspan="2"><input type="submit" value="Save" /></td>    
         </tr>    
        </table>    
       </form>   

       ${std.studentId}<br>
        ${std.studentName}