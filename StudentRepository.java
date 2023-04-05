package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dto.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{


}
