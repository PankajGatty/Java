package com.xworkz.CrudOperation.Service;

import com.xworkz.CrudOperation.Entity.Order;

public class OrderServiceImpl implements OrderService {

	@Override
	public boolean orderValidation(Order order) {
		if(order !=null) {
			if(order.getOrderId()>100) {
				System.out.println("Order ID :"+order.getOrderId());
	
				if(order.getCustomerId()>1000) {
					System.out.println("Customer ID :"+order.getCustomerId());
					
					if(order.getquantity()>0) {
						System.out.println("Quantity :"+order.getquantity());
						
						if (order.getStatus().equals("Delivered") ||order.getStatus().equals("Not Delivered")) {
							System.out.println("Status :"+order.getStatus());
							
							if(order.getTotalAmount()>100) {
								
								System.out.println("Total Amount :"+order.getTotalAmount());
								System.out.println("Order Saved");
								return true;
							}
						System.err.println("Amount is invalid");
						return false;
				}
				System.err.println("Status is invalid");
				return false;
			}
			System.err.println("Quantity is invalid");
			return false;
		}
		System.err.println("Customer ID is invalid");
		return false;
	}
	System.err.println("Order ID is invalid");
	return false;
	
}
	return false;
}

	

}
