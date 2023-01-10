package com.caiopivetta6.domain.enums;

public enum StatePayment {

	PROCESSING_PAYMENT(1, "PROCESSING_PAYMENT") ,PAID(2, "PAID"), CANCELED(2, "CANCELED"); 
	
	private Integer code;
	private String state;
	
	
	private StatePayment(Integer code, String state) {
		this.code = code;
		this.state = state;
	}
	
	public static StatePayment ToEnum(Integer code) {
		
		if(code == null) {
			return null;
		}
		
		for(StatePayment x : StatePayment.values()) {
			if(code == x.getCode()) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("id_invalid: " + code);
		
	}
	
	public int getCode() {
		return code;
	}
	
	public String StatePayment() {
		return state;
	}
	
}
