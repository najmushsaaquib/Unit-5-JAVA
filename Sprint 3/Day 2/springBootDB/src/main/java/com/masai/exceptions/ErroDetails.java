package com.masai.exceptions;

import java.time.LocalDateTime;

public class ErroDetails {

	private LocalDateTime timestamp;
	private String message;
	private String details;

	public ErroDetails() {
		// TODO Auto-generated constructor stub
	}

	public ErroDetails(LocalDateTime timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "ErroDetails [timestamp=" + timestamp + ", message=" + message + ", details=" + details + "]";
	}

}
