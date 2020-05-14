package com.example.hello;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringController {
	
	@GetMapping("/")
	public ResponseEntity<String> hello(@RequestParam("name") String name) {
		
		if (name != null) {
			return ResponseEntity.ok("Hello " + name);
		}
		
		return ResponseEntity.ok("Hello Spring");
	}

}
