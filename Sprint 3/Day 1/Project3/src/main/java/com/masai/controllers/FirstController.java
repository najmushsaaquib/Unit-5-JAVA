package com.masai.controllers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.masai.Products;
import com.masai.exceptions.ProductNotFound;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

	Products p = new Products();

	List<Products> l = p.data();

	@GetMapping("/products")
	public List<Products> listOfProducts() {

		return l;
	}

	@GetMapping("/product/{id}")
	public Products product(@PathVariable("id") Integer id) {

		for (Products obj : l) {

			if (obj.getId() == id) {

				return obj;
			}
		}

		throw new ProductNotFound("Your Product was not in the lsit");
	}

	@PostMapping("/product")
	public String addProduct(@RequestBody Products pro) {

		l.add(pro);

		return "product added" + pro;
	}

	@DeleteMapping("/product/{id}")
	public String deleted(@PathVariable("id") Integer id) {

		l.removeIf(obj -> obj.getId() == id);
		return "Product was deleted from the database";
	}

	@PutMapping("/product/{id}")
	public Products update(@RequestBody Products pro, @PathVariable("id") Integer id) {

		for (Products obj : l) {

			if (obj.getId() == id) {
				
				l.remove(obj);
				l.add(pro);
				return pro ;
				
			}

		}
		
		throw new ProductNotFound("Your Product was not in the lsit");
//		return null;
	}

}
