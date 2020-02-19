package com.projetosamir.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetosamir.course.entities.Product;
import com.projetosamir.course.repositories.ProductRepository;


@Service // registrando como componente, para a injeção autom. de dependencia (@Component, @Repository, etc.. )
public class ProductService {
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id); //findById rturn optional object
		
		return obj.get(); //return the user
	}
}
