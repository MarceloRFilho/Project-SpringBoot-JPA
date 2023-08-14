package com.CourseJava.SpringBootClass.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CourseJava.SpringBootClass.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
