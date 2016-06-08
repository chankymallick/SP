/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Chanky-JVM
 */
@Controller
public class CoreAPP {
     private static final String AppCtx = "C:\\Users\\Chanky-JVM\\Documents\\NetBeansProjects\\SP\\src\\spring.xml";
    @ResponseBody
    @RequestMapping(value="/test",method=RequestMethod.GET)
    public String TestCore() {
        ApplicationContext apctx = new FileSystemXmlApplicationContext(AppCtx);
        Student std = apctx.getBean("StudentBean", Student.class);
        StringBuilder sb = new StringBuilder();
        sb.append("Student ID : "+std.getStudentID()).append("<br>");
        sb.append("Student Name : "+std.getStudentName()).append("<br>");
        sb.append("Student CGPA : "+std.getCGPA()).append("<br>");
        sb.append("Bengali Marks : "+std.getMarks().getBengali()).append("<br>");
        sb.append("English Marks : "+std.getMarks().getEnglish()).append("<br>");
        return sb.toString();
        
    }
    
}
