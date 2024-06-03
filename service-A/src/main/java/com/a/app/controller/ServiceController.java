package com.a.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.a.app.models.User;
import com.a.app.repo.UserRepository;

@RestController
@RequestMapping(value = "/service-A")
public class ServiceController {

	@Autowired
	private UserRepository userRepository;
	@PostMapping
	public ResponseEntity<?> method1(@RequestBody User user) {
		userRepository.save(user);
		return ResponseEntity.ok("Service-A-Controller work");
	}
}
