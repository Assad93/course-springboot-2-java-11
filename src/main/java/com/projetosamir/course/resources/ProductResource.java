package com.projetosamir.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetosamir.course.entities.Product;
import com.projetosamir.course.services.ProductService;

@RestController // controlador Web
@RequestMapping(value="/products") //mapear URL
public class ProductResource { // Classe que é o recurso web referente a classe user
	
	@Autowired
	private ProductService service;
	
	@GetMapping // responde ao metodo Get
	public ResponseEntity<List<Product>> findAll(){
		List<Product> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id){
		Product obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	/*
	 * Este é o controlador Web que responde no caminho /users 
	 **/
}
