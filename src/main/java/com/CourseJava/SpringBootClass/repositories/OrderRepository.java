package com.CourseJava.SpringBootClass.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CourseJava.SpringBootClass.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{

}
