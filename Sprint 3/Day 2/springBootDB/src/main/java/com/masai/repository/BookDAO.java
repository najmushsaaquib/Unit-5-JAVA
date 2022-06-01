package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.models.Book;

@Repository
public interface BookDAO extends JpaRepository<Book, Integer>{

}
