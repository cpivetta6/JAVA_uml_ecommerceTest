package com.caiopivetta6.domain.enums;

public enum ClientType {

	LEGAL_PERSON(1, "LEGAL PERSON") , PHYSICAL_PERSON(2, "PHYSICAL PERSON");
	
	private int code;
	private String description;
	
	
	private ClientType(int code, String description) {
		this.code = code;
		this.description = description;
	}


	public static ClientType ToEnum(Integer code) {
		if(code == null) {
			return null;
		}
		
		for(ClientType x : ClientType.values()) {
			if(code.equals(x.getCode())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("id_invalid: " + code);
		
		
	}
	
	
	public int getCode() {
		return code;
	}
	public String getDescription() {
		return description;
	}
	
	
	
	
}
