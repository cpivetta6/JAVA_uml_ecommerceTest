package com.caiopivetta6.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caiopivetta6.Services.exceptions.ObjectNotFoundException;
import com.caiopivetta6.domain.Order;
import com.caiopivetta6.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public Order find(Integer id) {
		
		Optional<Order> obj = repository.findById(id);
		
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Object not found! Id: " + id + ", Tipo: " + Order.class.getName()));

	}
}
