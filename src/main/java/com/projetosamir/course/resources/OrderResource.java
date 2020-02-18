package com.projetosamir.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetosamir.course.entities.Order;
import com.projetosamir.course.services.OrderService;

@RestController // controlador Web
@RequestMapping(value="/orders") //mapear URL
public class OrderResource { // Classe que é o recurso web referente a classe Order
	
	@Autowired
	private OrderService service;
	
	@GetMapping // responde ao metodo Get
	public ResponseEntity<List<Order>> findAll(){
		List<Order> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	/*
	 * Este é o controlador Web que responde no caminho /Orders 
	 **/
}
