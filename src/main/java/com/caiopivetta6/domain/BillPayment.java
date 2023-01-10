package com.caiopivetta6.domain;

import java.util.Date;

import com.caiopivetta6.domain.enums.StatePayment;

import jakarta.persistence.Entity;
@Entity
public class BillPayment extends Payment {

	
	private Date paymentDate;
	private Date paymentExpiration;

	
	public BillPayment() {
		
	}


	public BillPayment(Integer id, StatePayment state, Order order, Date paymentDate, Date paymentExpiration) {
		super(id, state, order);
		
		this.paymentDate = paymentDate;
		this.paymentExpiration = paymentExpiration;
		// TODO Auto-generated constructor stub
	}


	public Date getPaymentDate() {
		return paymentDate;
	}


	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}


	public Date getPaymentExpiration() {
		return paymentExpiration;
	}


	public void setPaymentExpiration(Date paymentExpiration) {
		this.paymentExpiration = paymentExpiration;
	}
	
	
	
	

	
	
	
	
	
}
