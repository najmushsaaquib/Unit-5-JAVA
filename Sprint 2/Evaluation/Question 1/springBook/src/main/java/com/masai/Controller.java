package com.masai;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/books")
	public List<Book> getListOfBooks() {

		List<Book> bookList = new ArrayList<>();

		bookList.add(new Book(11, "Life Of Pi", "Yenn Martel", 1111));
		bookList.add(new Book(22, "Two States", "Chetan Bhagat", 2221));
		bookList.add(new Book(33, "The Three Mistakes Of My Life", "Chetan Bhagat", 3330));
		bookList.add(new Book(15, "Half Girlfriend", "Chetan Bhagat", 1999));
		bookList.add(new Book(55, "Five Point Someone", "Chetan Bhagat", 5055));

		return bookList;
	}

	@GetMapping(value = "/book/{id}")
	public Book getBookById(@PathVariable("id") Integer id) {

		Book b1 = new Book(id, "Life Of Pi", "Yenn Martel", 1111);

		return b1;

	}

	@PostMapping(value = "/book")
	public String createBook(@RequestBody Book book) {
		return "Book succesfully created," + book;
	}

}
