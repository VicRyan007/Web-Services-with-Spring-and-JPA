package com.ryan.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ryan.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long>{
	
	
	
}
