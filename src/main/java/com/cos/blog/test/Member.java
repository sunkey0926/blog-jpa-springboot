package com.cos.blog.test;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


//@Getter
//@Setter
@Data
@AllArgsConstructor // 모든 생성자
@NoArgsConstructor // 빈 생성
@Builder
public class Member {

	private int id;
	private String username;
	private String password;
	private String email;
	
	
	
	
}
