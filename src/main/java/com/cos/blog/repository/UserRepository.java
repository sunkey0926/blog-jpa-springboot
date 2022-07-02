package com.cos.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cos.blog.model.Users;

@Repository // 생략가능 
public interface UserRepository extends JpaRepository<Users, Long>{

}
