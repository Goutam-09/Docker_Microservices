package com.b.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.b.app.models.Product;
import com.b.app.repo.ProductRepository;

@RestController
@RequestMapping(value = "/service-B")
public class ServiceController {


	@Autowired
	private ProductRepository userRepository;
	@PostMapping
	public ResponseEntity<?> method1(@RequestBody Product user) {
		userRepository.save(user);
		return ResponseEntity.ok("Service-B-Controller work");
	}
}
