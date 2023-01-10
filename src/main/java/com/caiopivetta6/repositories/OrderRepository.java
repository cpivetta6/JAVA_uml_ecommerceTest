package com.caiopivetta6.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caiopivetta6.domain.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

	
	
}
