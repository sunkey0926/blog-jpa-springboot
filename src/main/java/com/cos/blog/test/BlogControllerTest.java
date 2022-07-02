package com.cos.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class BlogControllerTest {

	
	@GetMapping(value = "/getTest")
	public String getTest() {
		return "aaaa";
	}
	
}
