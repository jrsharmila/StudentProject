package com.student.credoprdemo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.credoprdemo.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
