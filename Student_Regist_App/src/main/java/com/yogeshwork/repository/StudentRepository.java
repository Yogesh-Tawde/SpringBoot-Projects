package com.yogeshwork.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yogeshwork.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity,Integer>{

}
