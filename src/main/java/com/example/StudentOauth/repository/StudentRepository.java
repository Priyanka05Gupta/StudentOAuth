package com.example.StudentOauth.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.StudentOauth.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
