package com.cos.blog.test;

import java.util.Optional;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cos.blog.model.RoleType;
import com.cos.blog.model.Users;
import com.cos.blog.repository.UserRepository;

@RestController
public class DummyControllerTest {

	@Autowired // 의존성주입DI)
	private UserRepository userRepository;
	
	@PostMapping("/dummy/join")
	public String join(Users users) {
//	public String join(@RequestParam("username") String username, String password, String email) {
//		System.out.println("username : " + username);
//		System.out.println("password : " + password);
//		System.out.println("email : " + email);
		System.out.println(users.toString());
		
		users.setRole(RoleType.USER);
		userRepository.save(users);
		
		return "회원가입이 완료되었습니다."; 
	}
	
//	@GetMapping("/dummy/user/{id}")
//	public Users detail(@PathVariable Long id) {
//		Users user = userRepository.findById(id).orElseThrow(new Supplier<IllegalArgumentException>() {
//			@Override
//			public IllegalArgumentException get() {
//				// TODO Auto-generated method stub
//				return new IllegalArgumentException("해당 유저는 없습니다. id : " + id);
//			}
//		});
//		return user;
//	}
	
	@GetMapping("/dummy/user/{id}")
	public Users detail(@PathVariable Long id) {
		Users user = userRepository.findById(id).orElseThrow(()->{
			return new IllegalArgumentException("해당 유저는 없습니다. id : " + id);
		});
		return user;
	}
	
	
}
