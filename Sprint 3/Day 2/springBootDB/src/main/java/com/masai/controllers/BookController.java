package com.masai.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.models.Book;
import com.masai.services.BookServices;

@RestController
public class BookController {

	@Autowired
	BookServices bdimp;

	@GetMapping("/books")
	public List<Book> getListOfBooks() {

		List<Book> listOfBooks = bdimp.getAllBooks();
		return listOfBooks;

	}

	@PostMapping("/book")
	public Book createBook(@RequestBody Book book) {

		Book newBook = bdimp.createBook(book);

		return newBook;
	}

	@GetMapping("/book/{id}")
	public Book getBookById(@PathVariable("id") Integer id) {

		Book bookById = bdimp.bookById(id);
		return bookById;

	}

	@DeleteMapping("/book/{id}")
	public Book deleteBookById(@PathVariable("id") Integer id) {

		Book deletedBook = bdimp.deleteBookById(id);

		return deletedBook;

	}
	
	@PutMapping("/book/{id}")
	public Book updateBookById(@PathVariable("id") Integer id) {

		Book updatedBook = bdimp.updateBookById(id);

		return updatedBook;

	}
	
}
