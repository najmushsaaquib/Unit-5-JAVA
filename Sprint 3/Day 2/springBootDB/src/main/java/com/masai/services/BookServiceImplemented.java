package com.masai.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exceptions.BookNotFoundException;
import com.masai.exceptions.NoDataFoundException;
import com.masai.models.Book;
import com.masai.repository.BookDAO;

@Service
public class BookServiceImplemented implements BookServices {

	@Autowired
	BookDAO bdao;

	@Override
	public List<Book> getAllBooks() {
		List<Book> listOfBook = bdao.findAll();
		if (listOfBook.isEmpty())
			throw new NoDataFoundException("Oops, we didn't find any list of books in the database");

		return listOfBook;
	}

	@Override
	public Book createBook(Book book) {
		Book newBook = bdao.save(book);
		return newBook;
	}

	@Override
	public Book bookById(Integer id) {

		// Use this three lines of the last line
//		Optional<Book> optBook = bdao.findById(id);
//		Book bookById = optBook.get();
//		return bookById;

		return bdao.findById(id)
				.orElseThrow(() -> new BookNotFoundException("Oops, your book is not available in the Database"));

	}

	@Override
	public Book deleteBookById(Integer id) {

		Book existingBook = bdao.findById(id)
				.orElseThrow(() -> new BookNotFoundException("We couldn't find any book with the given id :" + id));

		bdao.delete(existingBook);
		// TODO Auto-generated method stub
		return existingBook;
	}

	@Override
	public Book updateBookById(Integer id) throws BookNotFoundException {
		// TODO Auto-generated method stub

		Book existingBook = bdao.findById(id)
				.orElseThrow(() -> new BookNotFoundException("We couldn't find any book with the given id :" + id));

		Book updatedBook = bdao.save(existingBook);

		return updatedBook;

	}

}
