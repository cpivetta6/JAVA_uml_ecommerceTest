package com.caiopivetta6.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caiopivetta6.domain.Client;


public interface ClientRepository extends JpaRepository<Client, Integer> {

	
	
}
