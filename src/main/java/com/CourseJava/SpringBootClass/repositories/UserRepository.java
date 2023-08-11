package com.CourseJava.SpringBootClass.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CourseJava.SpringBootClass.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
