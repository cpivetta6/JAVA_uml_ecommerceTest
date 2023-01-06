package com.caiopivetta6.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caiopivetta6.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	
	
}
