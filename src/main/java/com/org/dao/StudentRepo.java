package com.org.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
