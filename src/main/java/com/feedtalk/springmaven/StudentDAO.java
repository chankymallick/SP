/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.feedtalk.springmaven;
import org.springframework.jdbc.core.JdbcTemplate;
/**
 *
 * @author Mallick
 */
public class StudentDAO {
    private JdbcTemplate  jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
    public int saveStudent(Student student)
    {       
        String Query = "INSERT INTO STUDENT VALUES ("+student.getStudentId()+","+student.getStudentName()+")";        
        return jdbcTemplate.update(Query);
    }
    
    public Student getStudent(int StudentID)
    {
         String Query = "SELECT *FROM STUDENT WHERE STUDENTID="+StudentID;        
         return jdbcTemplate.queryForObject(Query,Student.class);
    }
    
    
    
}
