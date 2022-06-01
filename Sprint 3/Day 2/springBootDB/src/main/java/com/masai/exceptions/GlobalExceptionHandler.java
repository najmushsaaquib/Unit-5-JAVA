package com.masai.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(NoDataFoundException.class)
	public ResponseEntity<ErroDetails> noDataFound(NoDataFoundException ndf, WebRequest req) {

		System.out.println(
				"If you are seeing this, it means you didn't find any book in the Database and got stuck in No Data Found Exception");

		ErroDetails errorDetail = new ErroDetails(LocalDateTime.now(), ndf.getMessage(), req.getDescription(false));

		ResponseEntity<ErroDetails> re = new ResponseEntity(errorDetail, HttpStatus.BAD_REQUEST);

		return re;

	}

	@ExceptionHandler(BookNotFoundException.class)
	public ResponseEntity<ErroDetails> bookNotFound(BookNotFoundException bnf, WebRequest req) {

		System.out.println(
				"If you are seeing this, it means you didn't find the book you were looking for and got stuck in Book Not Found Exception");

		ErroDetails errorDetail = new ErroDetails(LocalDateTime.now(), bnf.getMessage(), req.getDescription(false));

		ResponseEntity<ErroDetails> re = new ResponseEntity(errorDetail, HttpStatus.NOT_FOUND);

		return re;

	}

	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<ErroDetails> noHandlerFound(NoHandlerFoundException nhf, WebRequest req) {

		System.out.println("Cient even don't know how to send proper URI request");

		ErroDetails errorDetail = new ErroDetails(LocalDateTime.now(), nhf.getMessage(), req.getDescription(false));

		ResponseEntity<ErroDetails> re = new ResponseEntity(errorDetail, HttpStatus.NOT_ACCEPTABLE);

		return re;

	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErroDetails> superException(Exception se, WebRequest req) {

		System.out.println("The father of all exceptions");

		ErroDetails errorDetail = new ErroDetails(LocalDateTime.now(), se.getMessage(), req.getDescription(false));

		ResponseEntity<ErroDetails> re = new ResponseEntity(errorDetail, HttpStatus.I_AM_A_TEAPOT);

		return re;

	}

}
