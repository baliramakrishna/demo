package com.practice.spring.ui;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.spring.model.Student;
import com.practice.spring.service.Student_Service;

@RestController
@CrossOrigin(origins="http://localhost:4200")  
@RequestMapping(value="/api")  
public class Student_Controller {
	 
	@Autowired  
    private Student_Service studentservice;  
      
    @PostMapping("save-student")  
    public boolean saveStudent(@RequestBody Student student) {  
         return studentservice.saveStudent(student);  
          
    }  
      
    @GetMapping("students-list")  
    public Iterable<Student> allstudents() {  
         return studentservice.getStudents();  
          
    }  
      
    @DeleteMapping("delete-student/{student_id}")  
    public void deleteStudent(@PathVariable("student_id") int student_id) {   
         studentservice.deleteStudent(student_id);  
    }  
  
    @GetMapping("student/{student_id}")  
    public Optional<Student> allstudentByID(@PathVariable("student_id") int student_id) {
         return studentservice.getStudentByID(student_id);  
          
    }  
      
    @PostMapping("update-student/{student_id}")  
    public void updateStudent(@RequestBody Student student,@PathVariable("student_id") int student_id) {  
         studentservice.updateStudent(student,student_id);  
    }  
}
