package com.caiopivetta6.domain;

import com.caiopivetta6.domain.enums.StatePayment;

import jakarta.persistence.Entity;

@Entity
public class CardPayment extends Payment {

	private Integer numberRates;
	
	public CardPayment () {
		
	}

	public CardPayment(Integer id, StatePayment state, Order order, Integer numberRates) {
		super(id, state, order);
		this.numberRates = numberRates;
		
	}

	public Integer getNumberRates() {
		return numberRates;
	}

	public void setNumberRates(Integer numberRates) {
		this.numberRates = numberRates;
	}


	
	
	
}
