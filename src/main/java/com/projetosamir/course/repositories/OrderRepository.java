package com.projetosamir.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetosamir.course.entities.Order;
//@Repository... já herdada de jpa repository
public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
