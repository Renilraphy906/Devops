package com.devops.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devops.student.domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
