/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.feedtalk.springmaven;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Mallick
 */
@Controller
public class StudentController {
    
@RequestMapping("/empform")  
    public ModelAndView showform(){  
         //command is a reserved request attribute name, now use <form> tag to show object data  
        return new ModelAndView("empform","command",new Emp());  
    }  
    @RequestMapping(value="/save",method = RequestMethod.POST)  
    public ModelAndView save(@ModelAttribute("emp") Emp emp,@RequestParam("name") String name){  
        //write code to save emp object  
        //here, we are displaying emp object to prove emp has data  
        System.out.println(emp.getName()+" "+emp.getSalary()+" "+emp.getDesignation());  
        System.out.println("Parameter Name : "+name);
        return new ModelAndView("viewemp","command",emp);//will display object data  
    
        //return new ModelAndView("redirect:/viewemp");//will redirect to viewemp request mapping  
        
    }  
      
    @RequestMapping("/viewemp")  
    public ModelAndView viewemp(){  
        //write the code to get all employees from DAO  
        //here, we are writing manual code of list for easy understanding  
        List<Emp> list=new ArrayList<Emp>();  
        list.add(new Emp(1,"rahul",35000f,"S.Engineer"));  
        list.add(new Emp(2,"aditya",25000f,"IT Manager"));  
        list.add(new Emp(3,"sachin",55000f,"Care Taker"));  
          
        return new ModelAndView("viewemp","list",list);  
    }  
//    @RequestMapping(value="addStudent",method=RequestMethod.POST)
//    public ModelAndView setStudentData(@ModelAttribute("student") Student student,@RequestParam("StudentId") String SID)
//    {   
//      return new ModelAndView("viewStudent","std",student); 
//    }
    
    @RequestMapping(value="/addStudent/{userid}",method=RequestMethod.POST,produces = "application/pdf")
    @ResponseBody
    public String setStudentData(@ModelAttribute("student") Student student,@RequestParam("StudentId") String SID,@PathVariable("userid") String UserId)
    { 
     ApplicationContext ctx = new ClassPathXmlApplicationContext("WEB-INF/applicationContext.xml");
     StudentDAO studentdao = (StudentDAO)ctx.getBean("StudentDAO");
     int i= studentdao.saveStudent(student);       
     if(i>0)
      return SID+ " --- "+student.StudentName+" Saved Succesfully";
     else
      return SID+ " --- "+student.StudentName+" Not Saved";
    }
    
    
    @RequestMapping("/studentForm")  
    public ModelAndView showStudent(){  
         //command is a reserved request attribute name, now use <form> tag to show object data  
        return new ModelAndView("StudentForm","command",new Student());  
    }  
    
    
}
