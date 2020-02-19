package com.projetosamir.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetosamir.course.entities.Category;
import com.projetosamir.course.services.CategoryService;

@RestController // controlador Web
@RequestMapping(value="/categories") //mapear URL
public class CategoryResource { // Classe que é o recurso web referente a classe user
	
	@Autowired
	private CategoryService service;
	
	@GetMapping // responde ao metodo Get
	public ResponseEntity<List<Category>> findAll(){
		List<Category> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){
		Category obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	/*
	 * Este é o controlador Web que responde no caminho /users 
	 **/
}
