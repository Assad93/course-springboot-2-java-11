package com.projetosamir.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetosamir.course.entities.Category;
import com.projetosamir.course.repositories.CategoryRepository;


@Service // registrando como componente, para a injeção autom. de dependencia (@Component, @Repository, etc.. )
public class CategoryService {
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id); //findById rturn optional object
		
		return obj.get(); //return the user
	}
}
