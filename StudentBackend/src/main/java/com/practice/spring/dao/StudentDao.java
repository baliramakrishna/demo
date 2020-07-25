package com.practice.spring.dao;

import org.springframework.data.repository.CrudRepository;

import com.practice.spring.model.Student;

public interface StudentDao extends CrudRepository<Student, Integer> {

}
