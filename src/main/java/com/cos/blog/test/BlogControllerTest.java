package com.cos.blog.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/http")
public class BlogControllerTest {

	
	@GetMapping(value = "/get")
	public Member getTest(Member member) {

		// builder 패
		Member m = Member.builder().username("test").password("aas").build();
		
		return m;
	}
	
	@PostMapping(value = "/post")
	public Member postTest(@RequestBody Member member) {
		
		//return member.getId() + member.getUsername();
		return member;
	}
	
	@PutMapping(value = "/put")
	public Member putTest(@RequestBody Member member) {
		return member;
	}
	
	@DeleteMapping(value = "/delete")
	public Member deleteTest(@RequestBody Member member) {
		return member;
	}
	
}
