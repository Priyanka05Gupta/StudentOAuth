package com.example.StudentOauth.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentOauth.model.Student;
import com.example.StudentOauth.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository studentRepo;

	@Override
	public void create(Student stud) {
		studentRepo.save(stud);
	}

	@Override
	public Iterable<Student> findAll() {
		return studentRepo.findAll();
	}

	@Override
	public Optional<Student> findByStudentId(int studentId) {
		return studentRepo.findById(studentId);
	}
}
