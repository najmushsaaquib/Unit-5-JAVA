package com.masai;

public class PresentationBean {
	
	private ServiceBean service;

	public void setService(ServiceBean service) {
		this.service = service;
	}
	
	
	
	public int present(int x, int y) {
		System.out.println("Begining of the presentation layer");
		System.out.println("End of Presentation Layer");
		
		return service.calculate(x, y);
	}
	
	
	
}
