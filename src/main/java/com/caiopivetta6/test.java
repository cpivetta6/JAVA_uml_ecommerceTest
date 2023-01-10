package com.caiopivetta6;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class test {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");
		
		System.out.println("Day: " + sdf.parse("02/02/2022 20:23").toInstant());
		
		
	}

}
