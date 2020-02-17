package com.projetosamir.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetosamir.course.entities.User;
import com.projetosamir.course.services.UserService;

@RestController // controlador Web
@RequestMapping(value="/users") //mapear URL
public class UserResource { // Classe que é o recurso web referente a classe user
	
	@Autowired
	private UserService service;
	
	@GetMapping // responde ao metodo Get
	public ResponseEntity<List<User>> findAll(){
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	/*
	 * Este é o controlador Web que responde no caminho /users 
	 **/
}
