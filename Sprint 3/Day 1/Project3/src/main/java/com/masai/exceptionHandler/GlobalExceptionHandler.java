package com.masai.exceptionHandler;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.masai.exceptions.InvalidURIException;
import com.masai.exceptions.ProductNotFound;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ProductNotFound.class)
	public ResponseEntity<ErroDetails> productNotFound(ProductNotFound pnf, WebRequest req) {

		System.out.println("Inside Product not found Exceptin of Global Exception");

		ErroDetails error = new ErroDetails(LocalDateTime.now(), pnf.getMessage(), req.getDescription(false));

		ResponseEntity<ErroDetails> re = new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);

		return re;

	}

	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<ErroDetails> myExHandler(NoHandlerFoundException ie, WebRequest req) {

		System.out.println("Inside Invalid URI Exception");

		ErroDetails error = new ErroDetails(LocalDateTime.now(), ie.getMessage(), req.getDescription(false));

		ResponseEntity<ErroDetails> re = new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);

		return re;
	}

	// to handle any other type of Exception
	@ExceptionHandler(Exception.class)
	public void myExceptionHandler(HttpServletResponse resp, Exception e) throws IOException {
		System.out.println("inside myHandler method...");
		resp.sendError(HttpStatus.BAD_REQUEST.value(), e.getMessage());
	}

}
