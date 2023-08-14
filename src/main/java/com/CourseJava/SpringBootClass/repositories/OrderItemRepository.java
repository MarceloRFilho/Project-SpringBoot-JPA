package com.CourseJava.SpringBootClass.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CourseJava.SpringBootClass.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer>{

}
