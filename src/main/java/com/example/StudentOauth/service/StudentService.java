package com.example.StudentOauth.service;

import java.util.Optional;

import com.example.StudentOauth.model.Student;

public interface StudentService {
	
	void create(Student stud);
	
	Iterable<Student> findAll();
	
	Optional<Student> findByStudentId(int studentId);

}
