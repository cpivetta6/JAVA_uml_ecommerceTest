package com.caiopivetta6.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caiopivetta6.domain.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {

	
	
}
