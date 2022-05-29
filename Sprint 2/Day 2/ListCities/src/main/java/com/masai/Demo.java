package com.masai;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		College c = ctx.getBean("col", College.class);	
		
		City cit = ctx.getBean("ct", City.class);
		
		cit.showList();
		System.out.println("=============================================================");
		
		List<Student>  l = c.getStud();
		
		for(Student k:l) {
			
			System.out.println(k);
		}
		
		ClassPathXmlApplicationContext  ct = (ClassPathXmlApplicationContext)ctx;
		
		ct.close();
	}

}
