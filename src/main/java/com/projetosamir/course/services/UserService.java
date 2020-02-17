package com.projetosamir.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetosamir.course.entities.User;
import com.projetosamir.course.repositories.UserRepository;


@Service // registrando como componente, para a injeção autom. de dependencia (@Component, @Repository, etc.. )
public class UserService {
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id); //findById rturn optional object
		
		return obj.get(); //return the user
	}
}
