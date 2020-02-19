package com.projetosamir.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetosamir.course.entities.Product;
//@Repository... já herdada de jpa repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
