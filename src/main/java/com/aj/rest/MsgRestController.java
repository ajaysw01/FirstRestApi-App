package com.aj.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MsgRestController {
	
	
	@PostMapping("/msg")
	public ResponseEntity<String> saveMsg() {
		
		String responseBody = "Message saved Successfully";
		return new ResponseEntity<String>(responseBody, HttpStatus.CREATED);
	}
	
	
	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcomeMsg() {
		String msg ="Welcome to Rest Api";
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
	
	@GetMapping("/greet")
	public String getGreetMsg() {
		return "Good Morning ";
	}
}