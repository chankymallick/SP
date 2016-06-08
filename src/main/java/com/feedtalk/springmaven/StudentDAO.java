/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.feedtalk.springmaven;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
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
        String Query = "INSERT INTO STUDENT (StudentId,StudentName) VALUES (?,?)";        
        return jdbcTemplate.update(Query,student.getStudentId(),student.getStudentName());
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
    
    
    public Student getStudent(int StudentID)
    {
         String Query = "SELECT * FROM STUDENT WHERE STUDENTID=?";        
         return jdbcTemplate.queryForObject(Query,new Object[]{new Integer(StudentID)} ,new StudentMapper());
    }
    public List<Student> getAllStudent()
    {
         String Query = "SELECT * FROM STUDENT";        
         //return jdbcTemplate.queryForObject(Query,new Object[]{new Integer(StudentID)} ,new StudentMapper());
         return jdbcTemplate.query(Query, new StudentMapper());
    }    
    
}
