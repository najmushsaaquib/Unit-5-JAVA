package com.masai.services;

import java.util.List;

import com.masai.exceptions.BookNotFoundException;
import com.masai.models.Book;


public interface BookServices {
	
	
	public List<Book> getAllBooks();
	public Book createBook( Book book  );
	public Book bookById(Integer id);
	public Book deleteBookById(Integer id) throws BookNotFoundException ;
	public Book updateBookById(Integer id) throws BookNotFoundException;
	
}
