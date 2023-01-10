package com.caiopivetta6.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caiopivetta6.domain.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {

	
	
}
