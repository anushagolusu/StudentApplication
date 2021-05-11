package com.example.demo.Dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {

	Page<Student> findAll(Pageable paging);

	Student save(Student student);
	
	}



