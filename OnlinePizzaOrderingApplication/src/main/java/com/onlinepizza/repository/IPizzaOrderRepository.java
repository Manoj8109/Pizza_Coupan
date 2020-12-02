package com.onlinepizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlinepizza.model.PizzaOrder;

public interface IPizzaOrderRepository extends JpaRepository<PizzaOrder, Integer>{

	
}

