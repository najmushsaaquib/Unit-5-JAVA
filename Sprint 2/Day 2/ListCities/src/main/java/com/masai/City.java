package com.masai;

import java.util.List;

public class City {
	
	private List<String> city;

	public void setCity(List<String> city) {
		this.city = city;
	}

	public void showList() {
		System.out.println("We are in List of Cities");
		System.out.println(city);
		
	}
	
}
