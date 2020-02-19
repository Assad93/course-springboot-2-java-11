package com.projetosamir.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetosamir.course.entities.OrderItem;
//@Repository... já herdada de jpa repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
