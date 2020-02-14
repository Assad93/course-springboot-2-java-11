package com.projetosamir.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetosamir.course.entities.User;

@RestController // controlador Web
@RequestMapping(value="/users") //mapear URL
public class UserResource { // Classe que é o recurso web referente a classe user
	@GetMapping // responde ao metodo Get
	public ResponseEntity<User> findAll(){
		User u = new User(1L,"Samir","samir@gmail.com","999316973","12345");
		return ResponseEntity.ok().body(u);
	}
	
	/*
	 * Este é o controlador Web que responde no caminho /users 
	 **/
}
