package com.projetosamir.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetosamir.course.entities.Order;
import com.projetosamir.course.repositories.OrderRepository;


@Service // registrando como componente, para a injeção autom. de dependencia (@Component, @Repository, etc.. )
public class OrderService {
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id); //findById rturn optional object
		
		return obj.get(); //return the Order
	}
}
