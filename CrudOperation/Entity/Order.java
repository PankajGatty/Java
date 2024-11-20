package com.xworkz.CrudOperation.Entity;

public class Order {
	private int orderId;
	 private int customerId;
	 private int quantity;
	 private String status;
	 private double totalAmount;
	 
	 
	 public Order(int orderId, int customerId, int quantity, String status, double totalAmount) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.quantity = quantity;
		this.status = status;
		this.totalAmount = totalAmount;
	}


	public int getOrderId() {
		return orderId;
	}


	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public int getquantity() {
		return quantity;
	}


	public void setquantity(int  quantity) {
		this.quantity = quantity;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public double getTotalAmount() {
		return totalAmount;
	}


	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	} 
	 
}
