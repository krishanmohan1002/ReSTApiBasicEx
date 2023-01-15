package com.example.demo.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

	@GetMapping("/get")
	public ResponseEntity<String> getOperation(){
		ResponseEntity<String> response = new ResponseEntity<String>("FROM GET OPERATION", HttpStatus.CREATED);
		return response;
	}
	
	@PostMapping("/save")
	public ResponseEntity<String> saveOperation(){
		ResponseEntity<String> response = new ResponseEntity<String>("FROM SAVE OPERATION", HttpStatus.CREATED);
		return response;
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteOperation(){
		return new ResponseEntity<String>("FROM DELETE OPERATION", HttpStatus.OK);
	}
	
	@PutMapping("/put")
	public ResponseEntity<String> putOperation(){
		return ResponseEntity.ok("FROM PUT OPERATION");
	}
	
	@PatchMapping("/patch")
	public ResponseEntity<String> patchOperation(){
		return ResponseEntity.status(HttpStatus.ACCEPTED).body("FROM PATCH OPERATION");
	}
}
