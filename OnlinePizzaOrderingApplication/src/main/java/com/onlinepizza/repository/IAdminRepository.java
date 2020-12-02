package com.onlinepizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlinepizza.model.Admin;

public interface IAdminRepository extends JpaRepository<Admin, Integer>{
	
		
}
