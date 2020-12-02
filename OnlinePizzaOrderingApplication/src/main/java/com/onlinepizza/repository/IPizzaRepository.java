package com.onlinepizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlinepizza.model.Pizza;

public interface IPizzaRepository extends JpaRepository<Pizza, Integer>{

	
}
