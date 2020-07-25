package com.practice.spring.service;

import java.util.List;
import java.util.Optional;

import com.practice.spring.model.Student;

public interface Student_Service {
	 public boolean saveStudent(Student student);  
	    public Iterable<Student> getStudents();  
	    public void deleteStudent(int id);  
	    public Optional<Student> getStudentByID(int id);  
	    public void updateStudent(Student student,int id);  
}
