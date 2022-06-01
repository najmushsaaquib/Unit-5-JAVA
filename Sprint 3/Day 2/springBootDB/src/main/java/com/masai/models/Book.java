package com.masai.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer BookId;
	
	private String name;
	private String author;
	private Integer price;

	public Book() {
	}

	public Book(Integer bookId, String name, String author, Integer price) {
		super();
		BookId = bookId;
		this.name = name;
		this.author = author;
		this.price = price;
	}

	public Integer getBookId() {
		return BookId;
	}

	public void setBookId(Integer bookId) {
		BookId = bookId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [BookId=" + BookId + ", name=" + name + ", author=" + author + ", price=" + price + "]";
	}

}
