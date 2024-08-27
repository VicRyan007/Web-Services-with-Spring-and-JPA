package com.ryan.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ryan.course.entities.User;

public interface UserRepository extends JpaRepository<User,Long>{
	
	
	
}
