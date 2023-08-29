package com.example.AwsPractice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class awsController {
	@GetMapping(value="/sayHi")
	public String sayHi() {
		return "Hi";
	}

}
