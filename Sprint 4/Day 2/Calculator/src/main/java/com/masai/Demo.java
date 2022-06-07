package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		int x = 5;
		int y = 17;
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		PresentationBean pbean = ctx.getBean("pb", PresentationBean.class);
		
		int ans =  pbean.present(x,y);
		System.out.println(ans);
		
	}

}
