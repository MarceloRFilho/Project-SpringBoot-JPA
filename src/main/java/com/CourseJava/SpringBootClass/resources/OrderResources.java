package com.CourseJava.SpringBootClass.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CourseJava.SpringBootClass.entities.Order;
import com.CourseJava.SpringBootClass.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResources {

	@Autowired
	private OrderService service;
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll(){
		List<Order> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Integer id){
		Order obj = service.FindById(id);
		return ResponseEntity.ok().body(obj);
	}
}
