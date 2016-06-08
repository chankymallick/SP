/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.feedtalk.springmaven;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 *
 * @author Chanky-JVM
 */
public class SimpleJDBCTemplateDao extends JdbcDaoSupport{
    
   public List<Student> getAllStudent()
    {
         String Query = "SELECT * FROM STUDENT";        
         //return jdbcTemplate.queryForObject(Query,new Object[]{new Integer(StudentID)} ,new StudentMapper());
         return this.getJdbcTemplate().query(Query, new StudentDAO.StudentMapper());
    }     
   
   public static final class StudentMapper implements  RowMapper<Student>
    {

        @Override
        public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
           Student s1 =new Student();
           s1.setStudentId(rs.getInt("StudentId"));
           s1.setStudentName(rs.getString("StudentName"));
           return s1;
        }
    
    }
    
}
