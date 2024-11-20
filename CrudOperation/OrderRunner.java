package com.xworkz.CrudOperation;

import com.xworkz.CrudOperation.Entity.Order;
import com.xworkz.CrudOperation.Service.OrderService;
import com.xworkz.CrudOperation.Service.OrderServiceImpl;


public class OrderRunner {
	public static void main(String[] args) {
		OrderService orderservice=new OrderServiceImpl();
		Order order=new Order(101,1001,2,"Delivered",120);
		
		orderservice.orderValidation(order);
	}
		
}
