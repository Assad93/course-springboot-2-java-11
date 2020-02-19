package com.projetosamir.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetosamir.course.entities.Category;
import com.projetosamir.course.entities.User;
//@Repository... já herdada de jpa repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
