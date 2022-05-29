package com.masai;

import java.util.List;

public class College {

	private List<Student> stud;
	
	public College() {
		super();
		System.out.println("Thi is initilization phase");
	}

	public void setStud(List<Student> stud) {
		this.stud = stud;
	}

	public List<Student> getStud() {
		return stud;
	}

	public void before() {
		System.out.println("Begining of the earth");
	}

	public void destroy() {

		System.out.println("Garbage has been destroyed");
		System.out.println("Thankyou for using our service");

	}

}
