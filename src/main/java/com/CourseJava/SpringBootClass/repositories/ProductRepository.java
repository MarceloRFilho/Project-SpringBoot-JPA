package com.CourseJava.SpringBootClass.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CourseJava.SpringBootClass.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
