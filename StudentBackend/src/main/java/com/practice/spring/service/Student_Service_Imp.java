package com.practice.spring.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.practice.spring.dao.StudentDao;
import com.practice.spring.model.Student;

@Service
@EnableTransactionManagement
public class Student_Service_Imp implements Student_Service {
   
	@Autowired
	StudentDao dao;
	
	@Override
	@Transactional
	public boolean saveStudent(Student student) {
		if(dao.save(student) != null)
			return true;
		else
			return false;
	}

	@Override
	@Transactional
	public Iterable<Student> getStudents() {
		return dao.findAll();
	}


	@Override
	@Transactional
	public void deleteStudent(int id) {
		 dao.deleteById(id);
	}

	

	@Override
	@Transactional
	public void updateStudent(Student student,int id) {
	   
	    student.setStudent_id(id);
	    dao.save(student);
	}

	@Override
	@Transactional
	public Optional<Student> getStudentByID(int id) {
		return dao.findById(id);
	}

	

	

}
