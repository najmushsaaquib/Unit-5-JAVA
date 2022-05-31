package com.masai.controllers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.masai.Products;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FirstController {
	
		
	@GetMapping("/products")
	public List<Products> listOfProducts(){
		
		List<Products> list = new ArrayList<>();
		
		list.add(new Products(11, "Tesla E3", 25175434, "Tesla", "Cars", "TA007", 102));
		list.add(new Products(17, "Tesla E2", 1145040, "Tesla", "Trucks", "TR010", 202));
		list.add(new Products(15, "MT 15", 145040, "Yamaha", "Bikes", "MT15", 515));
		list.add(new Products(26, "FZ-X", 125040, "Yamaha", "Bikes", "FZ26", 15));
		
		return list;
	}
	
	
	
	@GetMapping("/productbyid/{id}")
	public Products products( @PathVariable("id") Integer id  ){
		
		List<Products> list = new ArrayList<>();
		
		list.add(new Products(11, "Tesla E3", 25175434, "Tesla", "Cars", "TA007", 102));
		list.add(new Products(17, "Tesla E2", 1145040, "Tesla", "Trucks", "TR010", 202));
		list.add(new Products(15, "MT 15", 145040, "Yamaha", "Bikes", "MT15", 515));
		list.add(new Products(26, "FZ-X", 125040, "Yamaha", "Bikes", "FZ26", 15));
		
		for(Products obj:list) {
			
			if(obj.getId() == id) {
				
				return obj;
			}
		}
		
		return null;
	}
	
	
	
	
	@GetMapping("/hello")
	public String hello() {
		
		return "working";
	}
	
}
